/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import context.DBContext;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.account.Account;
import model.account.Feature;

/**
 *
 * @author Quang
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(String username, String password) {
        try {
            String sql = "SELECT a.[username]\n"
                    + "      ,a.[password]\n"
                    + "      ,a.[displayname]\n"
                    + "      ,a.[dob]\n"
                    + "      ,a.[gender]\n"
                    + "      ,a.[email]\n"
                    + "      ,a.[phonenumber],f.[fid] ,f.[url]\n"
                    + "  FROM [dbo].[Account] a\n"
                    + "		LEFT JOIN [GroupAccount] as gc ON a.[username] = gc.[username]\n"
                    + "		LEFT JOIN [Group] as g ON g.[gid] = gc.[gid]\n"
                    + "		LEFT JOIN [GroupFeature] as gf ON gf.[gid] = g.[gid]\n"
                    + "		LEFT JOIN [Feature] as f on f.[fid] = gf.[fid]\n"
                    + "		WHERE a.[username] = ? AND a.[password] = ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setDisplayname(rs.getString("displayname"));
                account.setDob(Date.valueOf(rs.getString("dob")));
                account.setGender(rs.getBoolean("gender"));
                account.setEmail(rs.getString("email"));
                account.setPhonenumber(rs.getString("phonenumber"));
                while (rs.next()) {
                    if (account != null) {
                        int fid = rs.getInt("fid");
                        if (fid != 0) {
                            Feature feature = new Feature();
                            feature.setFid(fid);
                            feature.setUrl(rs.getString("url"));
                            account.getFeatures().add(feature);
                        }
                    }
                }
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
