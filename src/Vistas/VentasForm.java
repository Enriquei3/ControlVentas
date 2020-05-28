
package Vistas;


import java.awt.print.Printable;
import java.awt.*;
import java.awt.print.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetalleVentas;
import modelo.ProductoDAO;
import modelo.Ventas;
import modelo.VentasDAO;
import modelo.producto;


/**
 *
 * @author Enrique Isales
 */
public class VentasForm extends javax.swing.JInternalFrame implements Printable {

    VentasDAO vdao= new VentasDAO();
    ClienteDAO cdao=new ClienteDAO();
    ProductoDAO pdao=new ProductoDAO();
    Ventas v=new Ventas();
    DetalleVentas dv=new DetalleVentas();
    Cliente cliente = new Cliente();
    
    producto p= new producto();
    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    int cant;
    double pre;
    double tpagar;
    int item=0;
    
    
    public VentasForm() {
        initComponents();
        generarSerie();
        fecha();
        
        
    }

    void generarSerie(){
        String serie=vdao.NroSerieVentas();
        if(serie==null){
            txtserie.setText("00000001");
        }else{
            int increment = Integer.parseInt(serie);
            increment = increment + 1;
            txtserie.setText("0000000"+increment);
        }
    }
    
    
    void fecha(){
        Calendar calendar = new GregorianCalendar();
        txtfecha.setText(""+calendar.get(Calendar.DAY_OF_MONTH)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR));
        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelfactura = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtclienteM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        txtfecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txttotalpagar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtserie = new javax.swing.JTextField();
        NitC = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        direccionC = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Operaciones = new javax.swing.JPanel();
        txtcodcliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnbuscarcliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtcodproducto = new javax.swing.JTextField();
        btnbuscarproducto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        btnagregarprecio = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        seleccantidad = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtproductoM = new javax.swing.JTextField();
        txtstockM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Modulo de Ventas");

        Panelfactura.setBackground(new java.awt.Color(255, 255, 255));
        Panelfactura.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(231, 76, 60));
        jLabel10.setText("Nombre:");

        txtclienteM.setEditable(false);
        txtclienteM.setBackground(new java.awt.Color(255, 255, 255));
        txtclienteM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO U.", "TOTAL"
            }
        ));
        tablaDetalle.setGridColor(new java.awt.Color(255, 255, 255));
        tablaDetalle.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaDetalle);
        if (tablaDetalle.getColumnModel().getColumnCount() > 0) {
            tablaDetalle.getColumnModel().getColumn(0).setMaxWidth(70);
            tablaDetalle.getColumnModel().getColumn(1).setMaxWidth(90);
            tablaDetalle.getColumnModel().getColumn(3).setMaxWidth(200);
            tablaDetalle.getColumnModel().getColumn(4).setMaxWidth(200);
            tablaDetalle.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        txtfecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(231, 76, 60));
        jLabel13.setText("Fecha:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(231, 76, 60));
        jLabel15.setText("Nit:");

        txttotalpagar.setEditable(false);
        txttotalpagar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(231, 76, 60));
        jLabel14.setText("TOTAL A PAGAR:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel5.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 76, 60));
        jLabel2.setText("PUNTO DE VENTA ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 76, 60));
        jLabel3.setText("Venta de Productos \" *** \"");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 76, 60));
        jLabel1.setText("Tel: 5454-5454  / 8787-8787");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 76, 60));
        jLabel4.setText("No. Serie");

        txtserie.setEditable(false);
        txtserie.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        NitC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(231, 76, 60));
        jLabel16.setText("NIT: 2200894-7");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(231, 76, 60));
        jLabel17.setText("Dirección:");

        direccionC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout PanelfacturaLayout = new javax.swing.GroupLayout(Panelfactura);
        Panelfactura.setLayout(PanelfacturaLayout);
        PanelfacturaLayout.setHorizontalGroup(
            PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelfacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelfacturaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelfacturaLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelfacturaLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelfacturaLayout.createSequentialGroup()
                                        .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelfacturaLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(72, 72, 72))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelfacturaLayout.createSequentialGroup()
                        .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelfacturaLayout.createSequentialGroup()
                                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addGroup(PanelfacturaLayout.createSequentialGroup()
                                        .addComponent(txtclienteM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(PanelfacturaLayout.createSequentialGroup()
                                .addComponent(direccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NitC, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelfacturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(34, 34, 34)
                        .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        PanelfacturaLayout.setVerticalGroup(
            PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelfacturaLayout.createSequentialGroup()
                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelfacturaLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(PanelfacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelfacturaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(txtclienteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel17))
                    .addComponent(NitC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(PanelfacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-32.png"))); // NOI18N
        jButton4.setText("CANCELAR");

        jButton5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caja-registradora-32.png"))); // NOI18N
        jButton5.setText("GENERAR VENTA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(97, 97, 97)
                .addComponent(jButton5)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Operaciones.setBackground(new java.awt.Color(255, 255, 255));
        Operaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtcodcliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(231, 76, 60));
        jLabel7.setText("COD. CLIENTE:");

        btnbuscarcliente.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnbuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_32px_2.png"))); // NOI18N
        btnbuscarcliente.setText("BUSCAR");
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(231, 76, 60));
        jLabel6.setText("COD. PRODU:");

        txtcodproducto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnbuscarproducto.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnbuscarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_32px_2.png"))); // NOI18N
        btnbuscarproducto.setText("BUSCAR");
        btnbuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarproductoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(231, 76, 60));
        jLabel8.setText("PRECIO:");

        txtprecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnagregarprecio.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnagregarprecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-base-de-datos-32.png"))); // NOI18N
        btnagregarprecio.setText("AGREGAR");
        btnagregarprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarprecioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(231, 76, 60));
        jLabel9.setText("CANTIDAD:");

        seleccantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(231, 76, 60));
        jLabel11.setText("PRODUCTO:");

        txtproductoM.setEditable(false);
        txtproductoM.setBackground(new java.awt.Color(255, 255, 255));
        txtproductoM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtstockM.setEditable(false);
        txtstockM.setBackground(new java.awt.Color(255, 255, 255));
        txtstockM.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(231, 76, 60));
        jLabel12.setText("STOCK:");

        javax.swing.GroupLayout OperacionesLayout = new javax.swing.GroupLayout(Operaciones);
        Operaciones.setLayout(OperacionesLayout);
        OperacionesLayout.setHorizontalGroup(
            OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(60, 60, 60)
                        .addComponent(seleccantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstockM, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(OperacionesLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(txtcodcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(OperacionesLayout.createSequentialGroup()
                                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(39, 39, 39)
                                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtprecio, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(txtcodproducto))
                                .addGap(18, 18, 18)
                                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnagregarprecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnbuscarproducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OperacionesLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel12)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperacionesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperacionesLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OperacionesLayout.createSequentialGroup()
                                        .addComponent(txtproductoM, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))))))))
        );
        OperacionesLayout.setVerticalGroup(
            OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtcodcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel11))
                    .addComponent(btnbuscarcliente))
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscarproducto)
                            .addComponent(jLabel6)))
                    .addGroup(OperacionesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtproductoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregarprecio)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtstockM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Operaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panelfactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panelfactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed

        buscarcliente();
        
    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    private void btnbuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarproductoActionPerformed

            buscarProducto();
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarproductoActionPerformed

    private void btnagregarprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarprecioActionPerformed

           agregarproducto();

        
    }//GEN-LAST:event_btnagregarprecioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        
         if(txttotalpagar.getText().equals("")){
             JOptionPane.showMessageDialog(this, "Debe Ingresar Datos");
             
         } else{
        
            guardarVenta();
            guardarDetalle();
            actualizarStock();
            
            //Imprimir Factura
            imprimirF();
            JOptionPane.showMessageDialog(this, "Venta Realizada con Exito");
            
            nuevoV();
            generarSerie();
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    void imprimirF(){
        try {
            //Crea la imagen la cual se imprimira
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if(top){
                gap.print();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error en imprimir factura"+ e);
        }
    }
    
    void nuevoV(){
        limpiarT();
       txtcodcliente.setText("");
       txtcodproducto.setText("");
       txtprecio.setText("");
       seleccantidad.setValue(1);
       txtclienteM.setText("");
       txtproductoM.setText("");
       txtstockM.setText("");
       
       txttotalpagar.setText("");
       txtcodcliente.requestFocus();
    }
    
    void limpiarT(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
            
        }
    }
 
    void actualizarStock(){
        for(int i=0; i < modelo.getRowCount(); i++){
            producto pr=new producto();
            idp=Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cant=Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pr=pdao.listarID(idp);
            int sa=pr.getStockP()- cant;
            pdao.actualizarStock(sa, idp);
        }
    }
    
    void guardarVenta(){
        int idv=1;
        int idc=cliente.getId();
        String serie=txtserie.getText();
        String fecha=txtfecha.getText();
        double monto=tpagar;
        String estado="1";
        
        v.setIdcliente(idc);
        v.setIdvendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado1(estado);
        vdao.GuardarVentas(v);
 
    }
   
    void guardarDetalle(){
        String idv=vdao.IdVentas();
        int idve=Integer.parseInt(idv);
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            int idp=Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            int cant=Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            double pre=Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            dv.setIdventas(idve);
            dv.setIdproducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);
            vdao.GuardarDetalleVentas(dv);
        }
        
    }

   void agregarproducto(){
        double total;
       
        modelo=(DefaultTableModel)tablaDetalle.getModel();
        item=(item +1);
        idp=p.getId();
        String nomp=txtproductoM.getText();
         pre= Double.parseDouble(txtprecio.getText());
        cant = Integer.parseInt(seleccantidad.getValue().toString());
        int stock = Integer.parseInt(txtstockM.getText());
        total=cant*pre;
        
        ArrayList lista = new ArrayList();
        if(stock>0){
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(pre);
            lista.add(total);
            
            Object[] ob = new Object[6];
            ob[0]=lista.get(0);
            ob[1]=lista.get(1);
            ob[2]=lista.get(2);
            ob[3]=lista.get(3);
            ob[4]=lista.get(4);
            ob[5]=lista.get(5);
            modelo.addRow(ob);
            tablaDetalle.setModel(modelo);
            calculartotal();
            
            
        }else{
            JOptionPane.showMessageDialog(this,"Stock de Producto no Disponible");
        }
        
        
        
    }
    
   void calculartotal(){
       tpagar=0;
       for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
           cant=Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
           pre=Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
           tpagar=tpagar+(cant*pre); 
       }
       txttotalpagar.setText(""+tpagar);
       
       
   }

    void buscarProducto(){
        
        int id= Integer.parseInt( txtcodproducto.getText());
        if(txtcodproducto.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe Ingresar cod Producto");    
        }else{
              p=pdao.listarID(id);
            if(p.getId()!=0){
               txtproductoM.setText(p.getNomP());
               txtprecio.setText(""+p.getPrecioP());
               txtstockM.setText(""+p.getStockP());
                       
            }else{
                JOptionPane.showMessageDialog(this, "Producto no ingresado?");
                txtcodproducto.requestFocus();
                
            }
        }
        
        
    }

    void buscarcliente(){
        int r=0;
        String cod=txtcodcliente.getText();
        if(txtcodcliente.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe Ingresar cod Cliente");    
        }else{
             cliente=cdao.ListarID(cod);
            if(cliente.getDpi()!=null){
               txtclienteM.setText(cliente.getNom());
               NitC.setText(cliente.getDpi());
               direccionC.setText(cliente.getDir());
               txtcodproducto.requestFocus();
            }else{
                JOptionPane.showConfirmDialog(this, "Cliente no Registrado, Desea Registrar?");
                if(r==0){
                    ClienteForm cf=new ClienteForm();
                    Principal1.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NitC;
    private javax.swing.JPanel Operaciones;
    private javax.swing.JPanel Panelfactura;
    private javax.swing.JButton btnagregarprecio;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btnbuscarproducto;
    private javax.swing.JLabel direccionC;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner seleccantidad;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTextField txtclienteM;
    private javax.swing.JTextField txtcodcliente;
    private javax.swing.JTextField txtcodproducto;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtproductoM;
    private javax.swing.JTextField txtserie;
    private javax.swing.JTextField txtstockM;
    private javax.swing.JTextField txttotalpagar;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if(index>0){
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+ 30, pagfor.getImageableY() + 30);
        hub.scale(0.5 , 0.5);
        
        /* " el panel que se quiera imprimir"*/
        
        Panelfactura.printAll(graf);
        return PAGE_EXISTS;
        
    }
}
