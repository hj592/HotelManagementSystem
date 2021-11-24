/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dong.hotel.check;

import dong.hotel.file.RoomStateSave;
import dong.hotel.file.Sfr200Process;
import dong.hotel.file.Sfr300Process;
import dong.hotel.mainmenu.MainMenu;
import dong.hotel.reservation.CustomerInfor;
import dong.hotel.reservation.ReservationMenu;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nifskorea
 */
public class CheckIN extends javax.swing.JFrame {

    private ArrayList<CustomerInfor> customerinfor = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();

    public CheckIN() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReservationCheckIn = new javax.swing.JDialog();
        CheckIn_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SearchName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SearchRoom = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        Back_B = new javax.swing.JButton();
        take_Butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Not_Reservation_BUTT = new javax.swing.JButton();
        Reservation_BUTT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Room_Num = new javax.swing.JTextField();
        Guest_Num = new javax.swing.JTextField();
        Back_BUTT = new javax.swing.JButton();
        CheckIn_BUTT = new javax.swing.JButton();

        ReservationCheckIn.setMinimumSize(new java.awt.Dimension(500, 320));

        jLabel5.setText("이름");

        jLabel6.setText("호실");

        Bsearch.setText("검색");

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호실", "인원", "전화번호", "기간"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(reservationTable);

        Back_B.setText("이전");
        Back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BActionPerformed(evt);
            }
        });

        take_Butt.setText("불러오기");
        take_Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_ButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CheckIn_panelLayout = new javax.swing.GroupLayout(CheckIn_panel);
        CheckIn_panel.setLayout(CheckIn_panelLayout);
        CheckIn_panelLayout.setHorizontalGroup(
            CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CheckIn_panelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchRoom))
                    .addGroup(CheckIn_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckIn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(take_Butt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CheckIn_panelLayout.setVerticalGroup(
            CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bsearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_B)
                    .addComponent(take_Butt))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReservationCheckInLayout = new javax.swing.GroupLayout(ReservationCheckIn.getContentPane());
        ReservationCheckIn.getContentPane().setLayout(ReservationCheckInLayout);
        ReservationCheckInLayout.setHorizontalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservationCheckInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CheckIn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ReservationCheckInLayout.setVerticalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservationCheckInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CheckIn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("체크인");

        Not_Reservation_BUTT.setText("비예약 고객");
        Not_Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Not_Reservation_BUTTActionPerformed(evt);
            }
        });

        Reservation_BUTT.setText("예약 고객");
        Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservation_BUTTActionPerformed(evt);
            }
        });

        jLabel2.setText("이름");

        jLabel3.setText("인원");

        jLabel4.setText("호실");

        Back_BUTT.setText("이전");
        Back_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BUTTActionPerformed(evt);
            }
        });

        CheckIn_BUTT.setText("체크인");
        CheckIn_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckIn_BUTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Back_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Room_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CheckIn_BUTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reservation_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Not_Reservation_BUTT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guest_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Not_Reservation_BUTT)
                    .addComponent(Reservation_BUTT))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Room_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Guest_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_BUTT)
                    .addComponent(CheckIn_BUTT))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BUTTActionPerformed
        MainMenu back = new MainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BUTTActionPerformed

    private void Not_Reservation_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Not_Reservation_BUTTActionPerformed
        ReservationMenu next = new ReservationMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Not_Reservation_BUTTActionPerformed

    private void Reservation_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservation_BUTTActionPerformed

        try {
            Sfr200Process cF = new Sfr200Process();
            cF.fRead();
            cF.sPlite();
            customerinfor = cF.returnGuestInfo();
            
            DefaultTableModel reservation = (DefaultTableModel)reservationTable.getModel();
            
            //현재날짜포맷
            
            for(int i =0; i<customerinfor.size();i++){
            //예약일 포맷
            //두개비교해서
            //현재날짜부터 예약일인 예약들만 출력!
            
                
            }
            
            
            
            ReservationCheckIn.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Reservation_BUTTActionPerformed

    private void take_ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_ButtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_take_ButtActionPerformed

    private void Back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BActionPerformed
        ReservationCheckIn.setVisible(false);
    }//GEN-LAST:event_Back_BActionPerformed

    private void CheckIn_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckIn_BUTTActionPerformed
        try {
            String name = Name.getText();
            String room = Room_Num.getText();
            String guest = Guest_Num.getText();

            String time = new SimpleDateFormat("HH:mm").format(System.currentTimeMillis());
            String t = new SimpleDateFormat("HH").format(System.currentTimeMillis());
            Sfr200Process cF = new Sfr200Process();
            cF.fRead();
            cF.sPlite();
            customerinfor = cF.returnGuestInfo();
            Sfr300Process rF = new Sfr300Process();
            rF.fRead();
            rF.sPlite();
            roomstate = rF.returnRoomState();

            for (int i = 0; i < roomstate.size(); i++) {
                if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty")
                        && Integer.parseInt(t) >= 15) { //선택호실이 비어있고3시이후라면(+체크인날짜와 현재날짜 동일하다면이것도 드가면 조을듯)
                    RoomStateSave checkIn = new RoomStateSave();
                    try {
                        String inDate = String.format("%s-%s-%s", customerinfor.get(i).getcInYear(), customerinfor.get(i).getcInMonth(), customerinfor.get(i).getcInDay());
                        String outDate = String.format("%s-%s-%s", customerinfor.get(i).getcOutYear(), customerinfor.get(i).getcOutMonth(), customerinfor.get(i).getcOutDay());
                        checkIn.inguest(roomstate.get(i).getIndex(), room, name, guest, inDate, time, outDate);
                        JOptionPane.showMessageDialog(null, "체크인 완료되었습니다.");
                    } catch (IOException ex) {
                        Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty") && Integer.parseInt(t) < 15) {
                    JOptionPane.showMessageDialog(null, "체크인 가능한 시간이 아닙니다.", "체크인 실패", JOptionPane.ERROR_MESSAGE);
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("full")) {
                    JOptionPane.showMessageDialog(null, "체크인 완료된 방입니다.", "체크인 실패", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CheckIn_BUTTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_B;
    private javax.swing.JButton Back_BUTT;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton CheckIn_BUTT;
    private javax.swing.JPanel CheckIn_panel;
    private javax.swing.JTextField Guest_Num;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Not_Reservation_BUTT;
    private javax.swing.JDialog ReservationCheckIn;
    private javax.swing.JButton Reservation_BUTT;
    private javax.swing.JTextField Room_Num;
    private javax.swing.JTextField SearchName;
    private javax.swing.JTextField SearchRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;
    private javax.swing.JButton take_Butt;
    // End of variables declaration//GEN-END:variables
}
