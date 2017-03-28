package me.veryyoung.qq.luckymoney;

public class VersionParam {

    public static String QQPluginClass = "com.tenpay.android.qqplugin.a.q";

    public static void init(int version) {
        if (version < 260) {
            QQPluginClass = "com.tenpay.android.qqplugin.a.o";
        } else if (version <= 312) {
            QQPluginClass = "com.tenpay.android.qqplugin.a.p";
        } else if (version <= 496) {
            QQPluginClass = "com.tenpay.android.qqplugin.a.q";
        }
    }

}
