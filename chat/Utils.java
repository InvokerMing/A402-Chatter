package chat;

import DAO.DAO;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;

public class Utils {
    public static final String SYSTEM_TEMP_PATH = System.getProperty("java.io.tmpdir");

    // 数据库验证登录
    public static int validateLogin(String account, String password) {
        ArrayList<Object> IDs = DAO.search("SELECT ID FROM user", "ID");
        if (!findID(account, IDs))
            return CError.ID_NOT_FOUND;
        else {
            ArrayList<Object> passwords = DAO.search("SELECT password FROM user where ID='" + account + "'", "password");
            String pw = (String) passwords.get(0);
            if (!pw.equals(password)) {
                return CError.WRONG_PASSWORD;
            } else {
                return CError.SUCCESS;
            }
        }
    }

    // 数据库验证注册
    public static int validateRegister(String account) {
        ArrayList<Object> IDs = DAO.search("SELECT ID FROM user", "ID");
        if (findID(account, IDs))
            return CError.ID_EXISTED;
        else
            return CError.SUCCESS;
    }

    // 在数据库中注册用户
    public static int register(int ID, String password) {
        String sql = "INSERT INTO user (ID,password) VALUES (" + ID + ",'" + password + "')";
        return DAO.executeSQL(sql, DAO.INSERT);
    }

    // 更新user数据库记录中的shop字段
    public static int updateShop(String shopLink, String ID) {
        String sql = "UPDATE user SET shop='" + shopLink + "' where ID='" + ID + "'";
        return DAO.executeSQL(sql, DAO.UPDATE);
    }

    public static boolean findID(String account, ArrayList<Object> result) {
        for (Object obj : result) {
            String uid = (String) obj;
            if (uid.equals(account))
                return true;
        }
        return false;
    }

    // 使JTable自动适应列宽
    public static void fitTableColumns(JTable myTable, String[] ignoredColumnLabels) {
        JTableHeader header = myTable.getTableHeader();
        int rowCount = myTable.getRowCount();
        int sum = 0;
        Enumeration<TableColumn> columns = myTable.getColumnModel().getColumns();
        while (columns.hasMoreElements()) {
            boolean flag = false;
            TableColumn column = columns.nextElement();
            for (String str : ignoredColumnLabels)
                if (column.getHeaderValue().equals(str)) {
                    flag = true;
                    sum += column.getWidth();
                    break;
                }
            if (flag) continue;
            int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
            int width = (int) myTable.getTableHeader().getDefaultRenderer()
                    .getTableCellRendererComponent(myTable, column.getIdentifier(), false, false, -1, col)
                    .getPreferredSize().getWidth();
            for (int row = 0; row < rowCount; row++) {
                int preferredWidth = (int) myTable.getCellRenderer(row, col)
                        .getTableCellRendererComponent(myTable, myTable.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
                width = Math.max(width, preferredWidth);
            }
            header.setResizingColumn(column);
            int fixedW = myTable.getIntercellSpacing().width;
            column.setWidth(width + fixedW + 5);
            sum += column.getWidth();
        }
        if (sum < myTable.getWidth())
            myTable.getColumnModel().getColumn(0).setWidth(myTable.getWidth() - sum + myTable.getColumnModel().getColumn(0).getWidth());
    }

    // 获取URL文本
    public static String getStrByUrl(String urlStr) {
        String res=null;
        try {
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            //设置超时间为3秒
            conn.setConnectTimeout(3 * 1000);
            //防止屏蔽程序抓取而返回403错误
            conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //得到输入流
            InputStream inputStream = conn.getInputStream();
            res = readInputStream(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static String readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toString(StandardCharsets.UTF_8);
    }

    // 去掉JSON中的格式文本
    public static String purifyJSON(String JSON) {
        String result = JSON.replace(",", "\n");
        result = result.replace("\"", "");
        result = result.replace("[", "");
        result = result.replace("]", "");
        result = result.replace(":", "：");
        return result;
    }
}
