/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NewsController;
import controller.PhotoController;
import java.io.File;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Category;
import model.News;
import model.Photo;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author georgeborsato
 */
public class viewCadastreNews extends javax.swing.JDialog {

    /**
     * Creates new form viewCadastreNews
     */
    
    NewsController newsController;
    PhotoController photoController;
    News news = new News();
    Photo photo = new Photo();
    
    public viewCadastreNews(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.newsController = new  NewsController();
        this.photoController  = new PhotoController();
        this.blockAddPhoto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jTitle = new javax.swing.JTextField();
        jtitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jContent = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        dStartDate = new com.toedter.calendar.JDateChooser();
        dFinalDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        handleSend = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        handleListCategory = new javax.swing.JButton();
        addPhoto = new javax.swing.JPanel();
        handleAddPhoto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCodCategory = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTitle.setBackground(new java.awt.Color(255, 255, 255));
        jTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(33, 158, 188)));

        jtitle.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jtitle.setForeground(new java.awt.Color(33, 158, 188));
        jtitle.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 158, 188));
        jLabel2.setText("Data inicio");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 158, 188));
        jLabel3.setText("Data final");

        jContent.setBackground(new java.awt.Color(255, 255, 255));
        jContent.setColumns(20);
        jContent.setRows(5);
        jContent.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(33, 158, 188)));
        jScrollPane2.setViewportView(jContent);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 158, 188));
        jLabel4.setText("Conteúdo");

        dStartDate.setBackground(new java.awt.Color(255, 255, 255));
        dStartDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(33, 158, 188)));
        dStartDate.setForeground(new java.awt.Color(33, 158, 188));

        dFinalDate.setBackground(new java.awt.Color(255, 255, 255));
        dFinalDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(33, 158, 188)));

        jPanel2.setBackground(new java.awt.Color(33, 158, 188));

        handleSend.setBackground(new java.awt.Color(33, 158, 188));
        handleSend.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        handleSend.setForeground(new java.awt.Color(255, 255, 255));
        handleSend.setText("Enviar");
        handleSend.setBorder(null);
        handleSend.setBorderPainted(false);
        handleSend.setContentAreaFilled(false);
        handleSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        handleSend.setFocusPainted(false);
        handleSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(handleSend, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(handleSend, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(33, 158, 188));

        handleListCategory.setBackground(new java.awt.Color(33, 158, 188));
        handleListCategory.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        handleListCategory.setForeground(new java.awt.Color(255, 255, 255));
        handleListCategory.setText("Listar categoria");
        handleListCategory.setBorder(null);
        handleListCategory.setContentAreaFilled(false);
        handleListCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        handleListCategory.setFocusPainted(false);
        handleListCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleListCategoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(handleListCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(handleListCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addPhoto.setBackground(new java.awt.Color(33, 158, 188));

        handleAddPhoto.setBackground(new java.awt.Color(33, 158, 188));
        handleAddPhoto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        handleAddPhoto.setForeground(new java.awt.Color(255, 255, 255));
        handleAddPhoto.setText("Adicionar  Foto");
        handleAddPhoto.setBorder(null);
        handleAddPhoto.setContentAreaFilled(false);
        handleAddPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        handleAddPhoto.setFocusable(false);
        handleAddPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handleAddPhotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout addPhotoLayout = new javax.swing.GroupLayout(addPhoto);
        addPhoto.setLayout(addPhotoLayout);
        addPhotoLayout.setHorizontalGroup(
            addPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPhotoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(handleAddPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        addPhotoLayout.setVerticalGroup(
            addPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPhotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(handleAddPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 158, 188));
        jLabel5.setText("Cadastro noticia");

        jCodCategory.setBackground(new java.awt.Color(255, 255, 255));
        jCodCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jCodCategory.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(33, 158, 188)));

        jLabel1.setForeground(new java.awt.Color(33, 158, 188));
        jLabel1.setText("Código  categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtitle)
                                .addGap(0, 302, Short.MAX_VALUE))
                            .addComponent(jTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dFinalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dFinalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addPhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private Boolean validateDate(String title, Date startDate, Date finalDate, String content, String cod){
        
        if(title.trim().equals("")||  startDate.equals("") || finalDate.equals("")|| content.trim().equals("") || cod.trim().equals("")){
            return true;
        }
        
        return false;
    }
    
    private void blockAddPhoto(){
        handleAddPhoto.setVisible(false);
        addPhoto.setVisible(false);
    }
    
   private void  openAddPhoto(){
       handleAddPhoto.setVisible(true);
       addPhoto.setVisible(true);
   }
    
   private void clearIpunts(){
       jTitle.setText("");
       dStartDate.setDate(null);
       dFinalDate.setDate(null);
       jCodCategory.setText("");
       jContent.setText("");
   }
   
    private void handleSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleSendMouseClicked
       String title = jTitle.getText();
       Date startDate  =  dStartDate.getDate();
       Date finalDate =   dFinalDate.getDate();
       String content =  jContent.getText();
       String cod = jCodCategory.getText();
    
      
       if(validateDate(title, startDate, finalDate, content, cod)){
           JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios", "Alert", JOptionPane.WARNING_MESSAGE);
       }else{
           Integer codConvert = Integer.parseInt(cod);
           Category category = new Category();
           category.setId(codConvert);
            
            news.setTitle(title);
            news.setStartDate(startDate);
            news.setFinalDate(finalDate);
            news.setContent(content);
            news.setCategory(category);
            
           
           try {
               this.newsController.insert(news);
               JOptionPane.showMessageDialog(null, "Noticia inserida com sucesso");
               openAddPhoto();
               
           } catch (Exception e) {
               e.getStackTrace();
           }
       }
    }//GEN-LAST:event_handleSendMouseClicked

    private void handleListCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleListCategoryMouseClicked
        viewListCategory t = new viewListCategory(null, true);
        t.setVisible(true);
    }//GEN-LAST:event_handleListCategoryMouseClicked
    
    
    private void handleAddPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handleAddPhotoMouseClicked
        JFileChooser jfc = new JFileChooser();
         jfc.setDialogTitle("Escolha uma foto...");
         jfc.showDialog(null, "Selecionar");
         
         if(jfc.showDialog(null, "Selecionar") == JFileChooser.APPROVE_OPTION){
             File file = jfc.getSelectedFile();
             
             String name = FilenameUtils.getBaseName(file.getName());
             photo.setName(name);
             photo.setNews(news);
             
             try {
                 this.photoController.insert(photo);
                  JOptionPane.showMessageDialog(null, "Foto inserida  com sucesso");
                  clearIpunts();
                 
             } catch (Exception e) {
                 e.getStackTrace();
             }
    }//GEN-LAST:event_handleAddPhotoMouseClicked
 }
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
            java.util.logging.Logger.getLogger(viewCadastreNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCadastreNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCadastreNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCadastreNews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewCadastreNews dialog = new viewCadastreNews(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPhoto;
    private com.toedter.calendar.JDateChooser dFinalDate;
    private com.toedter.calendar.JDateChooser dStartDate;
    private javax.swing.JButton handleAddPhoto;
    private javax.swing.JButton handleListCategory;
    private javax.swing.JButton handleSend;
    private javax.swing.JTextField jCodCategory;
    private javax.swing.JTextArea jContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTitle;
    private javax.swing.JLabel jtitle;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
