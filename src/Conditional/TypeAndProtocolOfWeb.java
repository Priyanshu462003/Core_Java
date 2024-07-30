package Conditional;

import java.util.Scanner;
public class TypeAndProtocolOfWeb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url,protocol,extension;
        System.out.print("Enter the URL of Website:");
        url=sc.nextLine();
        protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("Protocol : Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("Protocol : File Transfer Protocol");
        }
        extension=url.substring(url.lastIndexOf(".")+1);
        if(extension.equals("com"))
        {
            System.out.println("extension : Commercial");
        }
        else if(extension.equals("org"))
        {
            System.out.println("extension : Organisation");
        }
        else if(extension.equals("net"))
        {
            System.out.println("extension : Network");
        }

    }
}
