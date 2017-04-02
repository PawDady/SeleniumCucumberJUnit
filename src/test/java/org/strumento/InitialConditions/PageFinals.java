package org.strumento.InitialConditions;

/**
 * Created by Pawel_D on 2017-02-10.
 */
public class PageFinals {
    private static final String ADRES_ADMIN = "https://streser.nazwa.pl/szkolenia/wp-admin/";
    private static final String LOGIN = "Warsztatautomatyzacja";
    private static final String PASSWORD = "xxxxxxxxxxxxxxx";
    private static final String ADRES = "http://streser.nazwa.pl/szkolenia/";
    private static final String EMAIL = "pawdady232312313@wp.pl";
    private static final String TABLE = "posts-filter";
    public static final String XPATH_USER = "wp-admin-bar-my-account";
    public static final String XPATH_LOGOUT = "//*[@id=\"wp-admin-bar-logout\"]/a";
    public static final String TEXT_LOGOUT = "Log Out";
    public static final String ID_LOGOUT = "wp-admin-bar-logout";

    public static String getXpathUser() {
        return XPATH_USER;
    }

    public static String getXpathLogout() {
        return XPATH_LOGOUT;
    }

    public static String getTextLogout() {
        return TEXT_LOGOUT;
    }

    public static String getIdLogout() {
        return ID_LOGOUT;
    }

    public static String getAdresAdmin() {
        return ADRES_ADMIN;
    }

    public static String getLOGIN() {
        return LOGIN;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getADRES() {
        return ADRES;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getTABLE() {
        return TABLE;
    }
}