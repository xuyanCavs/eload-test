package com.eload.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressUtils {

    public static String getIpAddress() {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return inetAddress.getHostAddress();
    }
}
