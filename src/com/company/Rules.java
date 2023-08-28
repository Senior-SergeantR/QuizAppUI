package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start , back;


    Rules(String name){
        this.name = name;

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel(" Welcome "+ name + " to Tripple A Coders");
        heading.setBounds(50,20, 700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        heading.setForeground(new Color(128,0,128));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90, 700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
                    "Has this ever happened to you? While looking for websites for research, you come across a research paper site that claims to connect academics to a peer-reviewed article database for free."+
                    "Intrigued, you search for keywords related to your topic, only to discover that you must pay a hefty subscription fee to access the service. After the umpteenth time being duped, you begin to wonder if there's even such a thing as free journal articles."+
                    "Subscription fees and paywalls are often the bane of students and academics, especially those at small institutions who don't provide access to many free article directories and repositories."+
                    "Whether you're working on an undergraduate paper, a PhD dissertation, or a medical research study, we want to help you find tools to locate and access the information you need to produce well-researched, compelling, and innovative work."+
                    "Below, we discuss why peer-reviewed articles are superior and list out the best free article databases to use in 2022."+
                "</html>"

        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(128,0,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(128,0,128));
        start.setForeground(Color.WHITE);

        start.addActionListener(this);
        add(start);


        setSize(800,650);
        setLocation(350,100);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == start){
                setVisible(false);
                new Quiz();
        }else if(ae.getSource() == back){

            setVisible(false);
            new Login();

        }

    }


    public static void main(String[] args){

    }






















}


