/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Che
 */
public class Matricula extends javax.swing.JFrame {

    /**
     * Creates new form Matricula
     */
    public Matricula() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CarnetEstudiante_JL = new javax.swing.JLabel();
        SiglasCurso_JL = new javax.swing.JLabel();
        CarnetEstudiante_JT = new javax.swing.JTextField();
        siglasCurso_JT = new javax.swing.JTextField();
        Matricular_JB = new javax.swing.JButton();

        CarnetEstudiante_JL.setText("Carnet ");

        SiglasCurso_JL.setText("Siglas");

        Matricular_JB.setText("Matricular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SiglasCurso_JL)
                                .addGap(27, 27, 27)
                                .addComponent(siglasCurso_JT))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CarnetEstudiante_JL)
                                .addGap(18, 18, 18)
                                .addComponent(CarnetEstudiante_JT, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(Matricular_JB)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarnetEstudiante_JL)
                    .addComponent(CarnetEstudiante_JT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SiglasCurso_JL)
                    .addComponent(siglasCurso_JT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(Matricular_JB)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarnetEstudiante_JL;
    private javax.swing.JTextField CarnetEstudiante_JT;
    private javax.swing.JButton Matricular_JB;
    private javax.swing.JLabel SiglasCurso_JL;
    private javax.swing.JTextField siglasCurso_JT;
    // End of variables declaration//GEN-END:variables
}
