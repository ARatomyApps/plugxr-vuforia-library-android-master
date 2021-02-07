package com.plugxr.plugxrvuforia;

import android.content.Context;
import android.content.Intent;


public class Plugxr  {

    private final Context mainActivity;
    private String LicenceKeyToUnity,AccessKeyToUnity,SecretKeyToUnity;

    public Plugxr(Context mainActivity) {

        this.mainActivity = mainActivity;
    }


    public void setVuforiaKeys(String LicenceKeyToUnity, String AccessKeyToUnity, String SecretKeyToUnity) {

        this.LicenceKeyToUnity = LicenceKeyToUnity;
        this.AccessKeyToUnity =AccessKeyToUnity;
        this.SecretKeyToUnity = SecretKeyToUnity;

    }

    public void start() {

        // Initialize Plugxr Ar Scene here
        Plugxr plugxrARScene = new Plugxr(mainActivity.getApplicationContext());


        // Set Vuforia license keys here
        String accessKeyToUnity = "6cfd55bfab638c8d211142c45c0e266259cb2e40";
        // Replace with your vuforia database keys
        String licenceKeyToUnity = "+PvD/////AAABmdQbF2R7y0r9qmVsBiFVvoEKxjfbz1xUuBHlObLAgUXfZp9SvvuHfHbC9ALKFSfXhtNoBqPT0hN18lfXMUIQkBGVi8vgdHTM6979sU6zeuqLBvdmdZF2N7XP/h4AZNTIPy/ZGdCpqDPDGAGnJGPIVXavjL5fQxVMbIDei52H9VJtLD2G/HGMROwCzWoogzRiAUi/UH7XoHr90PEr71M4ikIH7hB6RYKdrbY2HUXYK1k+sRFv5AlqlmvvzF36Vix0pbo0kdxCiKtbFZoA+F1hAWNCwXxonSb3ULz6/jty+BpiwdCmn3N67L7V63nokk/ga4XV6JTvArpwi/+OUChZXGXjN84q9/XHc1rzg7pQ74Xz";
        String secretKeyToUnity = "9995c4efa3a714eb4d2b1577661f787bfde8383f";
        plugxrARScene.setVuforiaKeys(licenceKeyToUnity, accessKeyToUnity, secretKeyToUnity);

        Intent intent = new Intent(mainActivity,PlugxrARScene.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("LicenceKeyToUnity",LicenceKeyToUnity);
        intent.putExtra("AccessKeyToUnity",AccessKeyToUnity);
        intent.putExtra("SecretKeyToUnity",SecretKeyToUnity);
        mainActivity.startActivity(intent);

    }

}
