package com.company;

import javax.jws.soap.SOAPMessageHandlers;

public class Main {

    public static void main(String[] args) {
	String example = "W" + " " + "Szczebrzeszynie" + " " + "chrząszcz" + " " + "brzmi" + " " + "w" + " " + "trzcinie.";

	System.out.println(example);

    String example2 = new StringBuilder().append("W").append(" ").append("Szczebrzeszynie").append(" ").append("chrząszcz").append(" ").append("brzmi").append(" ").append("w").append(" ").append("trzcinie.").toString();

    System.out.println(example2);

    String s = "Tomek";
    s = s + "i Magda";
    System.out.println(s);

    String example3 = "W Szczebrzeszynie chrząszcz brzmi w trzcinie";
        int indexOf = example3.indexOf("Szcze");
        System.out.println(indexOf);

        int indexOf2 = example3.indexOf("Szcze",10);
        System.out.println(indexOf2);

        String example4 = "W Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie";
        boolean startWith = example4.startsWith("S  W");
        boolean startWith2 = example4.endsWith("ie");

        System.out.println(startWith);
        System.out.println(startWith2);

        String example5 = "W Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie";
        int start = example5.indexOf("ch");
        int end = example5.indexOf("nie", 20);
        String substring = example5.substring(start, end + 3);

        System.out.println(substring);

        String text = "Ala ma kota, Ala ma psa, Ala ma muchę";
        int indexOff = text.indexOf("Ala");
        System.out.println(indexOff);
        int lastIndexOff = text.lastIndexOf("Ala");
        System.out.println(lastIndexOff);
        boolean startsWith = text.startsWith("Ala");
        System.out.println(startsWith);

        String przykład = "Jo lo ma to do sie bie że nic nie wie";
        String wycinamyy = przykład.substring(10);
        String wyc = przykład.substring(12, 15);
        System.out.println(wycinamyy);
        System.out.println(wyc);

        String duże = przykład.toUpperCase();
        System.out.println(duże);
    }

}
