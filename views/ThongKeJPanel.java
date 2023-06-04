/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:       Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:            Nhom 9
 */
package views;

import controllers.ThongKeController;

/**
 *
 * @author duato
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
        initComponents();
        
        ThongKeController controller = new ThongKeController(jScrollPane_DoanhThuHangThang);
        controller.initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnThongKe = new javax.swing.JPanel();
        jpnThongKeTitle = new javax.swing.JPanel();
        jlbThongKeTitle = new javax.swing.JLabel();
        jpnThongKeMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane_DoanhThuHangThang = new javax.swing.JScrollPane();

        jpnThongKeTitle.setBackground(new java.awt.Color(51, 204, 0));

        jlbThongKeTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbThongKeTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongKeTitle.setText("BÁO CÁO - THỐNG KÊ");

        javax.swing.GroupLayout jpnThongKeTitleLayout = new javax.swing.GroupLayout(jpnThongKeTitle);
        jpnThongKeTitle.setLayout(jpnThongKeTitleLayout);
        jpnThongKeTitleLayout.setHorizontalGroup(
            jpnThongKeTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbThongKeTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThongKeTitleLayout.setVerticalGroup(
            jpnThongKeTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbThongKeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doanh thu hàng tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 16))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane_DoanhThuHangThang, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane_DoanhThuHangThang, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnThongKeMainLayout = new javax.swing.GroupLayout(jpnThongKeMain);
        jpnThongKeMain.setLayout(jpnThongKeMainLayout);
        jpnThongKeMainLayout.setHorizontalGroup(
            jpnThongKeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeMainLayout.setVerticalGroup(
            jpnThongKeMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongKeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongKeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addComponent(jpnThongKeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnThongKeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_DoanhThuHangThang;
    private javax.swing.JLabel jlbThongKeTitle;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnThongKeMain;
    private javax.swing.JPanel jpnThongKeTitle;
    // End of variables declaration//GEN-END:variables
}
