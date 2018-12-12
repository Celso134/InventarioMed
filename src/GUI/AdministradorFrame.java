/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Managers.*;
import Inventario.Inventario;
import Inventario.Estante;
import Inventario.Producto;

/**
 *
 * @author copec
 */
public class AdministradorFrame extends javax.swing.JFrame {

    ManejadorInventario manejadorInventario;
    ManejadorCatalogoProducto manejadorCatalogo;
    Usuarios.Administrador admin;
    ManejadorUsuarios usersManager;
    
    public AdministradorFrame(Usuarios.Administrador user, ManejadorUsuarios usersManager) {
        this.usersManager = usersManager;
        initComponents();
        manejadorCatalogo = new ManejadorCatalogoProducto();
        admin = user;
        manejadorCatalogo.cargaProductos();
        manejadorInventario = new ManejadorInventario(admin.getInventario());
        recargaCombo();
        recargaComboDos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        panelDerecha = new javax.swing.JPanel();
        equisde = new javax.swing.JPanel();
        Welcome = new javax.swing.JLabel();
        agregarEstantesPanel = new javax.swing.JPanel();
        etiquetaFormaCrearUno = new javax.swing.JLabel();
        nombreEstante = new javax.swing.JTextField();
        estanteNeim = new javax.swing.JLabel();
        cantidadEspacios = new javax.swing.JTextField();
        espaciosDelEstante = new javax.swing.JLabel();
        wardEstante = new javax.swing.JButton();
        etiquetaFormaCrearDos = new javax.swing.JLabel();
        nombreEstante2 = new javax.swing.JTextField();
        stanteNeim = new javax.swing.JLabel();
        cantidadDeEspacios = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tamanioEspacio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        guardaEstante = new javax.swing.JButton();
        estantes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ampliarCatalogoPanel = new javax.swing.JPanel();
        agregarUnProducto = new javax.swing.JLabel();
        tiposDeProducto = new javax.swing.JComboBox<>();
        tipoDeProducto = new javax.swing.JLabel();
        nombreProducto = new javax.swing.JTextField();
        precioProducto = new javax.swing.JTextField();
        unidadDeMedida = new javax.swing.JTextField();
        clasifOEspecif = new javax.swing.JTextField();
        tamanioProducto = new javax.swing.JComboBox<>();
        productNeim = new javax.swing.JLabel();
        productCost = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fechaCaducidad = new javax.swing.JTextField();
        dimensionProducto = new javax.swing.JTextField();
        reducirCatalogoPanel = new javax.swing.JPanel();
        listaProductos = new javax.swing.JComboBox<>();
        etiquetaEstante1 = new javax.swing.JLabel();
        nombreProductoActual = new javax.swing.JTextField();
        wardaCatalogoBorrar = new javax.swing.JButton();
        productNeimEliminar = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        caducidad = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        unidadMedida = new javax.swing.JTextField();
        dimension = new javax.swing.JTextField();
        labelCadudicad = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelUMedida = new javax.swing.JLabel();
        labelDimension = new javax.swing.JLabel();
        distintivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelIzquierda = new javax.swing.JPanel();
        agregarEstante = new javax.swing.JButton();
        ampliarCatalogo = new javax.swing.JButton();
        reducirCatalogo = new javax.swing.JButton();
        cerrarSesion = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 450));
        setResizable(false);

        panelDerecha.setPreferredSize(new java.awt.Dimension(390, 410));
        panelDerecha.setLayout(new java.awt.CardLayout());

        Welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Welcome.setText("Bienvenido al panel Administrador");

        javax.swing.GroupLayout equisdeLayout = new javax.swing.GroupLayout(equisde);
        equisde.setLayout(equisdeLayout);
        equisdeLayout.setHorizontalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Welcome)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        equisdeLayout.setVerticalGroup(
            equisdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(equisdeLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        panelDerecha.add(equisde, "card2");

        agregarEstantesPanel.setPreferredSize(new java.awt.Dimension(390, 410));

        etiquetaFormaCrearUno.setText("Crear estante por defecto");

        estanteNeim.setText("Nombre del estante");

        cantidadEspacios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadEspaciosKeyTyped(evt);
            }
        });

        espaciosDelEstante.setText("Cantidad de espacios");

        wardEstante.setText("Guardar estante");
        wardEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardEstanteActionPerformed(evt);
            }
        });

        etiquetaFormaCrearDos.setText("Crear estante personalizado");

        stanteNeim.setText("Nombre del estante");

        cantidadDeEspacios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadDeEspaciosKeyTyped(evt);
            }
        });

        jLabel1.setText("Cantidad de espacios");

        tamanioEspacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamanioEspacioKeyTyped(evt);
            }
        });

        jLabel2.setText("Tamaño de cada espacio");

        guardaEstante.setText("Guardar estante");
        guardaEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaEstanteActionPerformed(evt);
            }
        });

        estantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin estantes" }));

        jLabel5.setText("Estantes definidos");

        javax.swing.GroupLayout agregarEstantesPanelLayout = new javax.swing.GroupLayout(agregarEstantesPanel);
        agregarEstantesPanel.setLayout(agregarEstantesPanelLayout);
        agregarEstantesPanelLayout.setHorizontalGroup(
            agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstantesPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guardaEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tamanioEspacio)
                    .addComponent(cantidadDeEspacios)
                    .addComponent(wardEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidadEspacios)
                    .addComponent(etiquetaFormaCrearUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreEstante)
                    .addComponent(nombreEstante2)
                    .addComponent(etiquetaFormaCrearDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stanteNeim)
                        .addComponent(estanteNeim)
                        .addComponent(espaciosDelEstante)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(estantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        agregarEstantesPanelLayout.setVerticalGroup(
            agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarEstantesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaFormaCrearUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estanteNeim))
                .addGap(18, 18, 18)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espaciosDelEstante))
                .addGap(18, 18, 18)
                .addComponent(wardEstante)
                .addGap(31, 31, 31)
                .addComponent(etiquetaFormaCrearDos)
                .addGap(18, 18, 18)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEstante2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stanteNeim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadDeEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(agregarEstantesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardaEstante)
                    .addComponent(estantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        panelDerecha.add(agregarEstantesPanel, "card3");

        agregarUnProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarUnProducto.setText("Agregar un producto al catálogo");

        tiposDeProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de producto", "Medicamento", "Material de curación" }));

        tipoDeProducto.setText("Tipo de producto");

        precioProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProductoKeyTyped(evt);
            }
        });

        tamanioProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tamaño", "Chico", "Mediano", "Grande" }));
        tamanioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioProductoActionPerformed(evt);
            }
        });

        productNeim.setText("Nombre del producto");

        productCost.setText("Precio del producto");

        jLabel6.setText("Fecha de caducidad d/m/a");

        jLabel7.setText("Unidad de medida");

        jLabel8.setText("Clasificacion/Espeficiacion");

        jLabel9.setText("Tamaño del producto");

        jButton3.setText("Agregar al catálogo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fechaCaducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaCaducidadKeyTyped(evt);
            }
        });

        dimensionProducto.setEditable(false);

        javax.swing.GroupLayout ampliarCatalogoPanelLayout = new javax.swing.GroupLayout(ampliarCatalogoPanel);
        ampliarCatalogoPanel.setLayout(ampliarCatalogoPanelLayout);
        ampliarCatalogoPanelLayout.setHorizontalGroup(
            ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampliarCatalogoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ampliarCatalogoPanelLayout.createSequentialGroup()
                        .addComponent(agregarUnProducto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ampliarCatalogoPanelLayout.createSequentialGroup()
                        .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dimensionProducto)
                            .addComponent(tamanioProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clasifOEspecif, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unidadDeMedida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiposDeProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaCaducidad))
                        .addGap(42, 42, 42)
                        .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ampliarCatalogoPanelLayout.createSequentialGroup()
                                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ampliarCatalogoPanelLayout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addComponent(tipoDeProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jButton3))
                                .addGap(19, 80, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ampliarCatalogoPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(productCost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(productNeim, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        ampliarCatalogoPanelLayout.setVerticalGroup(
            ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampliarCatalogoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarUnProducto)
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiposDeProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoDeProducto))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNeim))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCost))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clasifOEspecif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ampliarCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimensionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        panelDerecha.add(ampliarCatalogoPanel, "card5");

        reducirCatalogoPanel.setPreferredSize(new java.awt.Dimension(390, 410));

        listaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Productos" }));
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });

        etiquetaEstante1.setText("Producto: \"  \"");

        nombreProductoActual.setEditable(false);
        nombreProductoActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        wardaCatalogoBorrar.setText("Guardar cambios");
        wardaCatalogoBorrar.setToolTipText("");
        wardaCatalogoBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardaCatalogoBorrarActionPerformed(evt);
            }
        });

        productNeimEliminar.setText("Nombre del producto");

        jButton4.setText("Eliminar del catálogo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        caducidad.setEditable(false);
        caducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        precio.setEditable(false);
        precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        unidadMedida.setEditable(false);
        unidadMedida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dimension.setEditable(false);
        dimension.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelCadudicad.setText("Fecha de caducidad");

        labelPrecio.setText("Precio");

        labelUMedida.setText("Unidad de Medida");

        labelDimension.setText("Dimension");

        distintivo.setEditable(false);
        distintivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Clasificacion/Especificacion");

        javax.swing.GroupLayout reducirCatalogoPanelLayout = new javax.swing.GroupLayout(reducirCatalogoPanel);
        reducirCatalogoPanel.setLayout(reducirCatalogoPanelLayout);
        reducirCatalogoPanelLayout.setHorizontalGroup(
            reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reducirCatalogoPanelLayout.createSequentialGroup()
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reducirCatalogoPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(wardaCatalogoBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(reducirCatalogoPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(distintivo)
                            .addComponent(dimension)
                            .addComponent(unidadMedida)
                            .addComponent(precio)
                            .addComponent(caducidad)
                            .addComponent(nombreProductoActual)
                            .addComponent(listaProductos, 0, 125, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaEstante1)
                            .addComponent(productNeimEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelCadudicad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPrecio)
                            .addComponent(labelUMedida)
                            .addComponent(labelDimension)
                            .addComponent(jLabel3))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        reducirCatalogoPanelLayout.setVerticalGroup(
            reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reducirCatalogoPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstante1))
                .addGap(18, 18, 18)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProductoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNeimEliminar))
                .addGap(18, 18, 18)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCadudicad))
                .addGap(18, 18, 18)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrecio))
                .addGap(18, 18, 18)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUMedida))
                .addGap(18, 18, 18)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDimension))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reducirCatalogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distintivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(19, 19, 19)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(wardaCatalogoBorrar)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        panelDerecha.add(reducirCatalogoPanel, "card3");

        getContentPane().add(panelDerecha, java.awt.BorderLayout.EAST);

        panelIzquierda.setPreferredSize(new java.awt.Dimension(140, 40));

        agregarEstante.setText("Agregar Estante");
        agregarEstante.setToolTipText("");
        agregarEstante.setPreferredSize(new java.awt.Dimension(97, 23));
        agregarEstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEstanteActionPerformed(evt);
            }
        });

        ampliarCatalogo.setText("Ampliar catálogo");
        ampliarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ampliarCatalogoActionPerformed(evt);
            }
        });

        reducirCatalogo.setText("Reducir catálogo");
        reducirCatalogo.setPreferredSize(new java.awt.Dimension(97, 23));
        reducirCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reducirCatalogoActionPerformed(evt);
            }
        });

        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(reducirCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregarEstante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ampliarCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(agregarEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ampliarCatalogo)
                .addGap(32, 32, 32)
                .addComponent(reducirCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(cerrarSesion)
                .addGap(53, 53, 53))
        );

        getContentPane().add(panelIzquierda, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEstanteActionPerformed
        panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(agregarEstantesPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_agregarEstanteActionPerformed

    private void reducirCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reducirCatalogoActionPerformed
        panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(reducirCatalogoPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_reducirCatalogoActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            MainFrame mf = new MainFrame();
            this.dispose();
            mf.setVisible(true);
        }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void ampliarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ampliarCatalogoActionPerformed
panelDerecha.removeAll();
        panelDerecha.repaint();
        panelDerecha.revalidate();
        panelDerecha.add(ampliarCatalogoPanel);
        panelDerecha.repaint();
        panelDerecha.revalidate();
    }//GEN-LAST:event_ampliarCatalogoActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
        if (listaProductos.getSelectedIndex() == -1) {

        } else {
            if (((String) listaProductos.getSelectedItem()).equals("Productos")) {

            } else {
                java.util.ArrayList<Producto> productos = manejadorCatalogo.obtenerCatalogoProductos();

                nombreProductoActual.setText(
                        (String) listaProductos.getSelectedItem());
                caducidad.setText(productos.get(listaProductos.getSelectedIndex()).convertDateToString(productos.get(listaProductos.getSelectedIndex()).getFechaCaducidad()));
                precio.setText("$" + Float.toString(productos.get(listaProductos.getSelectedIndex()).getPrecio()));
                unidadMedida.setText(productos.get(listaProductos.getSelectedIndex()).getUnidadMedida());
                dimension.setText(productos.get(listaProductos.getSelectedIndex()).getDimension().getNombre());
                distintivo.setText(productos.get(listaProductos.getSelectedIndex()).getDistintivo());
                jLabel3.setText(productos.get(listaProductos.getSelectedIndex()).queEres());
            }
        }
    }//GEN-LAST:event_listaProductosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        agregarProductoCatalogo();
        recargaComboDos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tamanioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioProductoActionPerformed
        String cat = (String)tamanioProducto.getSelectedItem();
        int a = tamanioProducto.getSelectedIndex();
        switch(a){
            case 0:
            dimensionProducto.setText("");
            break;
            case 1:
                dimensionProducto.setText(cat);
                break;
            case 2:
                dimensionProducto.setText(cat);
                break;
            case 3:
                dimensionProducto.setText(cat);
                break;
        }
        
    }//GEN-LAST:event_tamanioProductoActionPerformed

    private void precioProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProductoKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || c =='.') {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_precioProductoKeyTyped

    private void fechaCaducidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaCaducidadKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c)) || c =='/') {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_fechaCaducidadKeyTyped

    private void guardaEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaEstanteActionPerformed
        crearEstanteUno();
    }//GEN-LAST:event_guardaEstanteActionPerformed

    private void wardEstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardEstanteActionPerformed
        crearEstanteDos();
    }//GEN-LAST:event_wardEstanteActionPerformed

    private void cantidadEspaciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadEspaciosKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadEspaciosKeyTyped

    private void cantidadDeEspaciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadDeEspaciosKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadDeEspaciosKeyTyped

    private void tamanioEspacioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamanioEspacioKeyTyped
        char c = evt.getKeyChar();
        if ((Character.isDigit(c))) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_tamanioEspacioKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Esta seguro?", "InfoBox: " + "confirmar", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            java.util.ArrayList<Producto> productos = manejadorCatalogo.obtenerCatalogoProductos();
            productos.remove(listaProductos.getSelectedIndex());
            recargaComboDos();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void wardaCatalogoBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardaCatalogoBorrarActionPerformed
        recargaComboDos();
        manejadorCatalogo.guardaProductos();
    }//GEN-LAST:event_wardaCatalogoBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    public void agregarProductoCatalogo() {
        boolean trel = false;
        if (nombreProducto.getText().equals("") || precioProducto.getText().equals("") || unidadDeMedida.getText().equals("") || clasifOEspecif.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No puede dejar un campo en blanco.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tamanioProducto.getSelectedIndex() <= 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un tamaño por favor.", "Error en campos", JOptionPane.ERROR_MESSAGE);
            } else {
                switch (tiposDeProducto.getSelectedIndex()) {
                    case 0:
                        JOptionPane.showMessageDialog(this, "Seleccione un tipo de producto porfavor.", "Error en campos", JOptionPane.ERROR_MESSAGE);
                        trel = false;
                        break;
                    case 1:
                        manejadorCatalogo.agregarProducto("Medicamento", nombreProducto.getText(), fechaCaducidad.getText(), Float.parseFloat(precioProducto.getText()), unidadDeMedida.getText(), "Medicamento", dimensionProducto.getText(), clasifOEspecif.getText());
                        trel = true;
                        manejadorCatalogo.guardaProductos();
                        break;
                    case 2:
                        manejadorCatalogo.agregarProducto("Material", nombreProducto.getText(), fechaCaducidad.getText(), Float.parseFloat(precioProducto.getText()), unidadDeMedida.getText(), "Medicamento", dimensionProducto.getText(), clasifOEspecif.getText());
                        trel = true;
                        manejadorCatalogo.guardaProductos();
                        break;
                }

                if (trel) {
                    JOptionPane.showMessageDialog(this, "Producto agregado satisfactoriamente.", "Producto agregado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al agregar producto.", "Error en campos", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public void crearEstanteUno() {
        if (nombreEstante2.getText().equals("") || cantidadDeEspacios.getText().equals("") || tamanioEspacio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No puede dejar un campo en blanco.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        } else {
            admin.crearEstante(nombreEstante2.getText(), Integer.parseInt(cantidadDeEspacios.getText()), Integer.parseInt(tamanioEspacio.getText()));
            manejadorInventario.guardaInventario(false);
            recargaCombo();
        }
    }

    public void crearEstanteDos() {
        if (nombreEstante.getText().equals("") || cantidadEspacios.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No puede dejar un campo en blanco.", "Error en campos", JOptionPane.ERROR_MESSAGE);
        } else {
            admin.crearEstante(nombreEstante.getText(), Integer.parseInt(cantidadEspacios.getText()));
            manejadorInventario.guardaInventario(false);
            recargaCombo();
        }
    }
    
    
    public void recargaCombo() {    
        java.util.ArrayList<Estante> estantes = admin.getEstantes();    
        if (estantes.isEmpty()) {
            System.out.println("Sin estantes"); 
        } else {
            this.estantes.removeAllItems();
            for (Estante estante : estantes) {
                this.estantes.addItem(estante.getNombre());
            }
        }
    }
    
    public void recargaComboDos(){
        java.util.ArrayList<Producto> productos = manejadorCatalogo.obtenerCatalogoProductos();
        if(productos.isEmpty()){
            System.out.println("Sin catalogo");
        }else{
            listaProductos.removeAllItems();
            for (Producto product : productos){
                listaProductos.addItem(product.getNombre());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton agregarEstante;
    private javax.swing.JPanel agregarEstantesPanel;
    private javax.swing.JLabel agregarUnProducto;
    private javax.swing.JButton ampliarCatalogo;
    private javax.swing.JPanel ampliarCatalogoPanel;
    private javax.swing.JTextField caducidad;
    private javax.swing.JTextField cantidadDeEspacios;
    private javax.swing.JTextField cantidadEspacios;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JTextField clasifOEspecif;
    private javax.swing.JTextField dimension;
    private javax.swing.JTextField dimensionProducto;
    private javax.swing.JTextField distintivo;
    private javax.swing.JPanel equisde;
    private javax.swing.JLabel espaciosDelEstante;
    private javax.swing.JLabel estanteNeim;
    private javax.swing.JComboBox<String> estantes;
    private javax.swing.JLabel etiquetaEstante1;
    private javax.swing.JLabel etiquetaFormaCrearDos;
    private javax.swing.JLabel etiquetaFormaCrearUno;
    private javax.swing.JTextField fechaCaducidad;
    private javax.swing.JButton guardaEstante;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCadudicad;
    private javax.swing.JLabel labelDimension;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelUMedida;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JTextField nombreEstante;
    private javax.swing.JTextField nombreEstante2;
    private javax.swing.JTextField nombreProducto;
    private javax.swing.JTextField nombreProductoActual;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField precioProducto;
    private javax.swing.JLabel productCost;
    private javax.swing.JLabel productNeim;
    private javax.swing.JLabel productNeimEliminar;
    private javax.swing.JButton reducirCatalogo;
    private javax.swing.JPanel reducirCatalogoPanel;
    private javax.swing.JLabel stanteNeim;
    private javax.swing.JTextField tamanioEspacio;
    private javax.swing.JComboBox<String> tamanioProducto;
    private javax.swing.JLabel tipoDeProducto;
    private javax.swing.JComboBox<String> tiposDeProducto;
    private javax.swing.JTextField unidadDeMedida;
    private javax.swing.JTextField unidadMedida;
    private javax.swing.JButton wardEstante;
    private javax.swing.JButton wardaCatalogoBorrar;
    // End of variables declaration//GEN-END:variables
}
