//package com.Affan.calander;
//import java.awt.Component;
//import java.util.Calendar;
//import java.util.Date;
//public class panelDate extends javax.swing.JLayeredPane {
//    private int month;
//    private int year;
//
//    public panelDate(int month, int year) {
//        initComponents();
//        this.month = month;
//        this.year = year;
//        init();
//    }
//
//    private void init() {
//        mon.asTitle();
//        tue.asTitle();
//        wed.asTitle();
//        thu.asTitle();
//        fri.asTitle();
//        sat.asTitle();
//        sun.asTitle();
//        setDate();
//    }
//
//    private void setDate() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, year);
//        calendar.set(Calendar.MONTH, month - 1);  //  month jan as 0 so start from 0
//        calendar.set(Calendar.DATE, 1);
//        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;  //  get day of week -1 to index
//        calendar.add(Calendar.DATE, -startDay);
//        toDay toDay = getToDay();
//        for (Component com : getComponents()) {
//            cell cell = (cell) com;
//            if (!cell.isTitle()) {
//                cell.setText(calendar.get(Calendar.DATE) + "");
//                cell.setDate(calendar.getTime());
//                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
//                if (toDay.isToDay(new toDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
//                    cell.setAsToDay();
//                }
//                calendar.add(Calendar.DATE, 1); //  up 1 day
//            }
//        }
//    }
//
//    private toDay getToDay() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        return new toDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
//    }
//
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        sun = new cell();
//        mon = new cell();
//        tue = new cell();
//        wed = new cell();
//        thu = new cell();
//        fri = new cell();
//        sat = new cell();
//        cell8 = new cell();
//        cell9 = new cell();
//        cell10 = new cell();
//        cell11 = new cell();
//        cell12 = new cell();
//        cell13 = new cell();
//        cell14 = new cell();
//        cell15 = new cell();
//        cell16 = new cell();
//        cell17 = new cell();
//        cell18 = new cell();
//        cell19 = new cell();
//        cell20 = new cell();
//        cell21 = new cell();
//        cell22 = new cell();
//        cell23 = new cell();
//        cell24 = new cell();
//        cell25 = new cell();
//        cell26 = new cell();
//        cell27 = new cell();
//        cell28 = new cell();
//        cell29 = new cell();
//        cell30 = new cell();
//        cell31 = new cell();
//        cell32 = new cell();
//        cell33 = new cell();
//        cell34 = new cell();
//        cell35 = new cell();
//        cell36 = new cell();
//        cell37 = new cell();
//        cell38 = new cell();
//        cell39 = new cell();
//        cell40 = new cell();
//        cell41 = new cell();
//        cell42 = new cell();
//        cell43 = new cell();
//        cell44 = new cell();
//        cell45 = new cell();
//        cell46 = new cell();
//        cell47 = new cell();
//        cell48 = new cell();
//        cell49 = new cell();
//
//        setLayout(new java.awt.GridLayout(7, 7));
//
//        sun.setForeground(new java.awt.Color(222, 12, 12));
//        sun.setText("Sun");
//        sun.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(sun);
//
//        mon.setText("Mon");
//        mon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(mon);
//
//        tue.setText("Tue");
//        tue.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(tue);
//
//        wed.setText("Wed");
//        wed.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(wed);
//
//        thu.setText("Thu");
//        thu.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(thu);
//
//        fri.setText("Fri");
//        fri.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(fri);
//
//        sat.setText("Sat");
//        sat.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(sat);
//
//        cell8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell8);
//
//        cell9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell9);
//
//        cell10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell10);
//
//        cell11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell11);
//
//        cell12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell12);
//
//        cell13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell13);
//
//        cell14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell14);
//
//        cell15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell15);
//
//        cell16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell16);
//
//        cell17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell17);
//
//        cell18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell18);
//
//        cell19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell19);
//
//        cell20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell20);
//
//        cell21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell21);
//
//        cell22.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell22);
//
//        cell23.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell23);
//
//        cell24.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell24);
//
//        cell25.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell25);
//
//        cell26.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell26);
//
//        cell27.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell27);
//
//        cell28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell28);
//
//        cell29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell29);
//
//        cell30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell30);
//
//        cell31.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell31);
//
//        cell32.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell32);
//
//        cell33.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell33);
//
//        cell34.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell34);
//
//        cell35.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell35);
//
//        cell36.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell36);
//
//        cell37.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell37);
//
//        cell38.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell38);
//
//        cell39.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell39);
//
//        cell40.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell40);
//
//        cell41.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell41);
//
//        cell42.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell42);
//
//        cell43.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell43);
//
//        cell44.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell44);
//
//        cell45.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell45);
//
//        cell46.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell46);
//
//        cell47.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell47);
//
//        cell48.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell48);
//
//        cell49.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
//        add(cell49);
//    }// </editor-fold>//GEN-END:initComponents
//
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private cell cell10;
//    private cell cell11;
//    private cell cell12;
//    private cell cell13;
//    private cell cell14;
//    private cell cell15;
//    private cell cell16;
//    private cell cell17;
//    private cell cell18;
//    private cell cell19;
//    private cell cell20;
//    private cell cell21;
//    private cell cell22;
//    private cell cell23;
//    private cell cell24;
//    private cell cell25;
//    private cell cell26;
//    private cell cell27;
//    private cell cell28;
//    private cell cell29;
//    private cell cell30;
//    private cell cell31;
//    private cell cell32;
//    private cell cell33;
//    private cell cell34;
//    private cell cell35;
//    private cell cell36;
//    private cell cell37;
//    private cell cell38;
//    private cell cell39;
//    private cell cell40;
//    private cell cell41;
//    private cell cell42;
//    private cell cell43;
//    private cell cell44;
//    private cell cell45;
//    private cell cell46;
//    private cell cell47;
//    private cell cell48;
//    private cell cell49;
//    private cell cell8;
//    private cell cell9;
//    private cell fri;
//    private cell mon;
//    private cell sat;
//    private cell sun;
//    private cell thu;
//    private cell tue;
//    private cell wed;
//}
