/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilerias.CambiaPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Utilerias.MenuItem;
import View.Pn_Nuevo_Empleado;
import static View.sesion.fecha;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread hilo;

    /**
     * Creates new form Main
     */
    public Principal() {
        setPantalla();
        initComponents();
        full_Screen();
        centrarPantalla();
        execute();
        mostrarFecha();
        mostrarHora();
        //PARA QUE APAREZCA LA PANTALLE DE INICIO AL COMENZAR LA APLICACION
        new CambiaPanel(pnlPrincipal, new Pn_Pantalla_inicio());
NoScrollBar();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        lb_cerrar_sesion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_minimize = new javax.swing.JLabel();
        lb_status = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lb_fecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        scroll_Menu = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jl_Icon_User = new javax.swing.JLabel();
        bt_acerdaDe = new Utilerias.RSButtonMetro();
        bt_cerrarSesion = new Utilerias.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(36, 47, 65));
        panelHeader.setPreferredSize(new java.awt.Dimension(561, 50));

        lb_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_close16_216470.png"))); // NOI18N
        lb_cerrar_sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_cerrar_sesionMouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menú Principal");

        lb_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minimized.png"))); // NOI18N
        lb_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_minimizeMouseClicked(evt);
            }
        });

        lb_status.setBackground(new java.awt.Color(255, 255, 255));
        lb_status.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_status.setForeground(new java.awt.Color(255, 255, 255));
        lb_status.setText("Activo");

        lb_usuario.setBackground(new java.awt.Color(255, 255, 255));
        lb_usuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(204, 204, 204));
        lb_usuario.setText("Sebastian Rocha Ortega");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leaf.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logosmall.png"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 774, Short.MAX_VALUE)
                .addComponent(lb_status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lb_usuario)
                .addGap(27, 27, 27)
                .addComponent(lb_minimize)
                .addGap(10, 10, 10)
                .addComponent(lb_cerrar_sesion)
                .addGap(12, 12, 12))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_cerrar_sesion)
                    .addComponent(lb_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_status)
                            .addComponent(lb_usuario)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(38, 38, 38))
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(239, 238, 244));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(128, 128, 131));
        jLabel11.setText("Sistema de Nóminas LavaExport");

        jScrollPane3.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane3.setViewportView(pnlPrincipal);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Fecha Actual");

        lb_fecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(128, 128, 131));
        lb_fecha.setText("dd/mm/yy");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Hora actual");

        lb_hora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_hora.setForeground(new java.awt.Color(128, 128, 131));
        lb_hora.setText("00:00:00");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/world.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel11)
                .addGap(236, 236, 236)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_fecha)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_hora)))
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(lb_fecha)
                        .addComponent(lb_hora))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        scroll_Menu.setBorder(null);

        menus.setBackground(new java.awt.Color(239, 238, 244));
        menus.setFocusable(false);
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        scroll_Menu.setViewportView(menus);

        jPanel2.setBackground(new java.awt.Color(239, 238, 244));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(128, 128, 131));
        jLabel5.setText("BIENVENIDO");

        jl_Icon_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user128.png"))); // NOI18N
        jl_Icon_User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_Icon_User)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jl_Icon_User, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        bt_acerdaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/question32x32.png"))); // NOI18N
        bt_acerdaDe.setText("Acerca de");
        bt_acerdaDe.setIconTextGap(34);
        bt_acerdaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acerdaDeActionPerformed(evt);
            }
        });

        bt_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit32x32.png"))); // NOI18N
        bt_cerrarSesion.setText("Cerrar Sesión");
        bt_cerrarSesion.setIconTextGap(20);
        bt_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_acerdaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(scroll_Menu)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_acerdaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        setSize(new java.awt.Dimension(1352, 743));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void execute() {
        //ICONOS PARA LOS BOTONES PRINCIPALES DEL MENUN
        ImageIcon IconHome = new ImageIcon(getClass().getResource("/Imagenes/home32x32.png"));
        ImageIcon iconArchivo = new ImageIcon(getClass().getResource("/Imagenes/archivo32x32.png"));
        ImageIcon iconNominas = new ImageIcon(getClass().getResource("/Imagenes/money32x32.png"));
       ImageIcon iconReportes = new ImageIcon(getClass().getResource("/Imagenes/reporte32x32.png"));
        ImageIcon iconConfiguracion = new ImageIcon(getClass().getResource("/Imagenes/config32x32.png"));
         

        //ICONO PARA LOS SUBMENUS
        ImageIcon subMenus = new ImageIcon(getClass().getResource("/Imagenes/newarrow20x20.png"));

//  SUBMENU PARA ARCHIVO
        MenuItem empleado = new MenuItem(subMenus, "Empleados", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Nuevo_Empleado());
            }
        });
        MenuItem horario = new MenuItem(subMenus, "Horarios", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Horario());
            }
        });
        MenuItem cargo = new MenuItem(subMenus, "Cargo", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Cargo());
            }
        });
        MenuItem departamento = new MenuItem(subMenus, "Departamento", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_departamento());
            }
        });
        MenuItem pago = new MenuItem(subMenus, "Pago", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Pago());
            }
        });
        //SUBMENU DE NOMINAS
        
        
        
        MenuItem RepImportar = new MenuItem(subMenus, "Importar Nómina", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Importar_Nomina());
            }
        });
        MenuItem RepExtras = new MenuItem(subMenus, "Extras", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Extras());
            }
        });
         
          MenuItem RepDescuentos = new MenuItem(subMenus, "Descuentos", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Descuentos());
            }
        });

        //SUBMENU REPORTES
        MenuItem RepNominaGral = new MenuItem(subMenus, "Nómina General", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Nomina_General());
            }
        });
        
        
        MenuItem RepNominaIndividual = new MenuItem(subMenus, "Nómina individual", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Nomina_Individual());
            }
        });
        
        
        /*MenuItem RepExtrasDescuentos = new MenuItem(subMenus, "Extras/Descuentos", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Extras_Descuentos());
            }
        });*/
        
        
        MenuItem RepAsistencias = new MenuItem(subMenus, "Asistencias", 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Asistencia());
            }
        });
        
         
        //SUBMENU DE CONFIGURACION
       // MenuItem RepImportar = new MenuItem(subMenus, "Importar Nómina", 10, new ActionListener() {
       //     @Override
        //    public void actionPerformed(ActionEvent ae) {
        //        new CambiaPanel(pnlPrincipal, new Pn_Importar_Nomina());
        //    }
        //});
        
   
//APARTADO DE TODOS LOS MENUS
        MenuItem MenuHome = new MenuItem(IconHome, "Principal", 35, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new CambiaPanel(pnlPrincipal, new Pn_Pantalla_inicio());
            }
        });

        MenuItem Archivo = new MenuItem(iconArchivo, "Archivo", 35, null, empleado, horario, cargo, departamento, pago);
        MenuItem Nominas = new MenuItem(iconNominas, "Nominas", 35, null,  RepImportar, RepExtras, RepDescuentos);
        MenuItem Reportes = new MenuItem(iconReportes, "Reportes", 35, null, RepNominaGral, RepNominaIndividual, RepAsistencias);
        //MenuItem Configuracion = new MenuItem(iconConfiguracion, "Configuración", 35, null, );

        addMenu(MenuHome, Archivo, Nominas, Reportes); //Configuracion);
    }

    //para eliminar el scrollbar de un jscrollpane
    public void NoScrollBar() {
        //scroll_Menu es el nombre del jscrollpane que contiene el panel del menu
        scroll_Menu.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    public void setPantalla() {

        //para eliminar el tittle bar
        this.setUndecorated(true);
        //para que no le cambien el tamaño
        this.setResizable(false);

    }

    public void centrarPantalla() {
        //para dejar el menu centrado y estatico
        this.setLocationRelativeTo(null);

    }

    public void full_Screen() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);

    }

    public void run() {
        // Thread current= Thread.currentThread();
        for (int i = 1; i > 0; i++) {
            if (i > 0) {
                hora();
                lb_hora.setText(hora + ":" + minutos + ":" + segundos);
            }
        }
    }

    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);

    }

    public void mostrarFecha() {
        //componente para fecha
        lb_fecha.setText(fecha());
    }

    public void mostrarHora() {
        //componentes para la hora
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    private void lb_cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrar_sesionMouseClicked
        Alert_Warning_Salir salir = new Alert_Warning_Salir(this, true);
        salir.titulo.setText("¿ESTAS SEGURO DE SALIR?");
        salir.setVisible(true);
    }//GEN-LAST:event_lb_cerrar_sesionMouseClicked

    private void lb_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizeMouseClicked
        this.setExtendedState(this.ICONIFIED);  // one way

    }//GEN-LAST:event_lb_minimizeMouseClicked

    private void bt_acerdaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acerdaDeActionPerformed
        Alert_Information_About acerca = new Alert_Information_About(this, true);
        String texto = "<html><body>Sistema de Nóminas V 1.0 <br>"
                + "Desarrollado por PIXEL SOFT & INTECH <br>"
                + "Ultima Actualización: 15/08/2019 <br>"
                + "Tehuacán, Puebla</body></html>";
        acerca.lb_titulo.setText(texto);
        acerca.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_acerdaDeActionPerformed

    private void bt_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cerrarSesionActionPerformed
        Alert_CerrarSesion sesion = new Alert_CerrarSesion(this, true);
        String texto = "¿Qué desea realizar?";
        sesion.lb_titulo_sesion.setText(texto);
        sesion.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_bt_cerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Utilerias.RSButtonMetro bt_acerdaDe;
    private Utilerias.RSButtonMetro bt_cerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jl_Icon_User;
    private javax.swing.JLabel lb_cerrar_sesion;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hora;
    private javax.swing.JLabel lb_minimize;
    private javax.swing.JLabel lb_status;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnlCentro;
    public javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scroll_Menu;
    // End of variables declaration//GEN-END:variables
}
