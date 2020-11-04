/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuestionBank {
        public static void main(String[] args) {
        Problem Prob = new Problem();
        Scanner sc = new Scanner(System.in);
        try {
            File QBs = new File("QBs.dat");
//            Scanner scnr = new Scanner(QBs);
//            while (scnr.hasNextLine()) {
//                String line = scnr.nextLine();
//                System.out.println(line);
//            }
            PrintWriter pw = new PrintWriter(new FileOutputStream(QBs, true));
            System.out.print("Enter id: ");
            String id = sc.nextLine();
            Prob.id = id;
            System.out.print("Enter date: ");
            String date = sc.nextLine();
            Prob.date = date;
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            Prob.name = name;
            System.out.print("Enter short Desc: ");
            String shortDesc = sc.nextLine();
            Prob.shortDesc = shortDesc;
            System.out.print("Enter fullDesc: ");
            String fullDesc = sc.nextLine();
            Prob.fullDesc = fullDesc;
            System.out.print("Enter category: ");
            String category = sc.nextLine();
            Prob.category = category;
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            Prob.author = author;
            System.out.print("Enter MarkWeight: ");
            double MarkWeight = sc.nextDouble();
            Prob.MarkWeight = MarkWeight;
            pw.append("\n" + Prob.id + "," + Prob.date + "," + Prob.name + "," + Prob.shortDesc + "," + Prob.fullDesc + "," + Prob.category + "," + Prob.author + "," + Prob.MarkWeight);
            pw.close();
        } catch (Exception e) {
        }
    }
}
