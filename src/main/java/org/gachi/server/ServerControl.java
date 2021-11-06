package org.gachi.server;

import java.util.Scanner;
import java.util.stream.Stream;

/*
 * Responsible for entering data for the administrator.
 * */
public class ServerControl extends Thread {
    private static final String cls = "/cls",
            info = "/info", sendMessage = "/msg", close = "/close",
            help = "/help";


    public ServerControl() {
        start();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        String _help = " /cls - clear terminal /info - server status information \n /close \n /help - it is reference\n";

        System.out.println(_help);

        while (true) {
            try {
                switch (scanner.next()) {
                    case cls:
                        Stream.iterate(0, (n) -> n + 1).limit(100).forEach(x -> System.out.println("\n"));
                        break;
                    case info:
                        System.out.println("Active streams: " + Thread.getAllStackTraces().keySet().size());
                        System.out.println("Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
                        break;
                    case help:
                        System.out.println(_help);
                        break;
                    case close:
//                        HibernateSessionFactory.shutdown();
                        System.exit(0);
                        return;
                    case sendMessage:
                    default:
                        System.out.println("What does this command mean?");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error enter data");
                break;
            }
        }
    }
}