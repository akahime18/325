/*    1:     */ package maria;
/*    2:     */ 
/*    3:     */ import java.awt.Color;
/*    4:     */ import java.awt.Container;
/*    5:     */ import java.awt.EventQueue;
/*    6:     */ import java.awt.Font;
/*    7:     */ import java.awt.Image;
/*    8:     */ import java.awt.event.ActionEvent;
/*    9:     */ import java.awt.event.ActionListener;
/*   10:     */ import java.io.IOException;
/*   11:     */ import java.util.logging.Level;
/*   12:     */ import java.util.logging.Logger;
/*   13:     */ import javax.imageio.ImageIO;
/*   14:     */ import javax.swing.GroupLayout;
/*   15:     */ import javax.swing.GroupLayout.Alignment;
/*   16:     */ import javax.swing.GroupLayout.ParallelGroup;
/*   17:     */ import javax.swing.GroupLayout.SequentialGroup;
/*   18:     */ import javax.swing.JButton;
/*   19:     */ import javax.swing.JFrame;
/*   20:     */ import javax.swing.JLabel;
/*   21:     */ import javax.swing.JMenu;
/*   22:     */ import javax.swing.JMenuBar;
/*   23:     */ import javax.swing.JMenuItem;
/*   24:     */ import javax.swing.JOptionPane;
/*   25:     */ import javax.swing.JPanel;
/*   26:     */ import javax.swing.JScrollPane;
/*   27:     */ import javax.swing.JTable;
/*   28:     */ import javax.swing.JTextArea;
/*   29:     */ import javax.swing.JTextField;
/*   30:     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*   31:     */ import javax.swing.UIManager;
/*   32:     */ import javax.swing.UIManager.LookAndFeelInfo;
/*   33:     */ import javax.swing.UnsupportedLookAndFeelException;
/*   34:     */ import javax.swing.table.DefaultTableModel;
/*   35:     */ import javax.swing.table.JTableHeader;
/*   36:     */ import javax.swing.table.TableColumn;
/*   37:     */ import javax.swing.table.TableColumnModel;
/*   38:     */ 
/*   39:     */ public class MARIAui
/*   40:     */   extends JFrame
/*   41:     */ {
/*   42:     */   int errorCounter;
/*   43:     */   HexadecimalToDecimal h;
/*   44:     */   String[] variablesArray;
/*   45:     */   String[] variableLocationsArray;
/*   46:     */   int variablesCounter;
/*   47:     */   int orgCounter;
/*   48:     */   int haltCounter;
/*   49:     */   int returnToFirstPassCounter;
/*   50:     */   Image i;
/*   51:     */   private JTextField ACtextfield;
/*   52:     */   private JTextField IRtextfield;
/*   53:     */   private JTextField MARtextfield;
/*   54:     */   private JTextField MBRtextfield;
/*   55:     */   private JTextField PCtextfield;
/*   56:     */   private JTable addressTable;
/*   57:     */   private JButton checkButton;
/*   58:     */   private JButton editButton;
/*   59:     */   private JTextArea editorTextArea;
/*   60:     */   private JMenuItem exitMenuItem;
/*   61:     */   private JLabel jLabel1;
/*   62:     */   private JLabel jLabel10;
/*   63:     */   private JLabel jLabel11;
/*   64:     */   private JLabel jLabel12;
/*   65:     */   private JLabel jLabel13;
/*   66:     */   private JLabel jLabel14;
/*   67:     */   private JLabel jLabel15;
/*   68:     */   private JLabel jLabel2;
/*   69:     */   private JLabel jLabel3;
/*   70:     */   private JLabel jLabel4;
/*   71:     */   private JLabel jLabel5;
/*   72:     */   private JLabel jLabel6;
/*   73:     */   private JLabel jLabel7;
/*   74:     */   private JLabel jLabel8;
/*   75:     */   private JLabel jLabel9;
/*   76:     */   private JMenu jMenu1;
/*   77:     */   private JMenuBar jMenuBar1;
/*   78:     */   private JPanel jPanel1;
/*   79:     */   private JScrollPane jScrollPane1;
/*   80:     */   private JScrollPane jScrollPane2;
/*   81:     */   private JScrollPane jScrollPane3;
/*   82:     */   private JButton outputDecButton;
/*   83:     */   private JButton outputHexButton;
/*   84:     */   private JTextArea outputTextArea;
/*   85:     */   private JMenuItem restartMenuItem;
/*   86:     */   private JButton runButton;
/*   87:     */   private JTextField statusTextField;
/*   88:     */   private JButton stopButton;
/*   89:     */   
/*   90:     */   public MARIAui()
/*   91:     */     throws IOException
/*   92:     */   {
/*   93:  28 */     initComponents();
/*   94:  29 */     setLocationRelativeTo(null);
/*   95:  30 */     initializeAddressTable();
/*   96:  31 */     this.h = new HexadecimalToDecimal();
/*   97:  32 */     this.i = ImageIO.read(getClass().getResource("MARIAicon.png"));
/*   98:  33 */     setIconImage(this.i);
/*   99:     */   }
/*  100:     */   
/*  101:     */   private void initComponents()
/*  102:     */   {
/*  103:  46 */     this.jPanel1 = new JPanel();
/*  104:  47 */     this.jScrollPane1 = new JScrollPane();
/*  105:  48 */     this.editorTextArea = new JTextArea();
/*  106:  49 */     this.ACtextfield = new JTextField();
/*  107:  50 */     this.MARtextfield = new JTextField();
/*  108:  51 */     this.MBRtextfield = new JTextField();
/*  109:  52 */     this.IRtextfield = new JTextField();
/*  110:  53 */     this.PCtextfield = new JTextField();
/*  111:  54 */     this.jLabel1 = new JLabel();
/*  112:  55 */     this.jLabel6 = new JLabel();
/*  113:  56 */     this.jLabel7 = new JLabel();
/*  114:  57 */     this.jLabel8 = new JLabel();
/*  115:  58 */     this.jLabel9 = new JLabel();
/*  116:  59 */     this.jScrollPane2 = new JScrollPane();
/*  117:  60 */     this.addressTable = new JTable();
/*  118:  61 */     this.runButton = new JButton();
/*  119:  62 */     this.jLabel2 = new JLabel();
/*  120:  63 */     this.jLabel3 = new JLabel();
/*  121:  64 */     this.jLabel4 = new JLabel();
/*  122:  65 */     this.jLabel5 = new JLabel();
/*  123:  66 */     this.jLabel11 = new JLabel();
/*  124:  67 */     this.jScrollPane3 = new JScrollPane();
/*  125:  68 */     this.outputTextArea = new JTextArea();
/*  126:  69 */     this.jLabel13 = new JLabel();
/*  127:  70 */     this.jLabel12 = new JLabel();
/*  128:  71 */     this.statusTextField = new JTextField();
/*  129:  72 */     this.stopButton = new JButton();
/*  130:  73 */     this.outputHexButton = new JButton();
/*  131:  74 */     this.outputDecButton = new JButton();
/*  132:  75 */     this.jLabel10 = new JLabel();
/*  133:  76 */     this.checkButton = new JButton();
/*  134:  77 */     this.jLabel14 = new JLabel();
/*  135:  78 */     this.jLabel15 = new JLabel();
/*  136:  79 */     this.editButton = new JButton();
/*  137:  80 */     this.jMenuBar1 = new JMenuBar();
/*  138:  81 */     this.jMenu1 = new JMenu();
/*  139:  82 */     this.restartMenuItem = new JMenuItem();
/*  140:  83 */     this.exitMenuItem = new JMenuItem();
/*  141:     */     
/*  142:  85 */     setDefaultCloseOperation(3);
/*  143:  86 */     setTitle("MARIA Simulator");
/*  144:  87 */     setResizable(false);
/*  145:     */     
/*  146:  89 */     this.jPanel1.setBackground(new Color(153, 153, 153));
/*  147:     */     
/*  148:  91 */     this.jScrollPane1.setHorizontalScrollBarPolicy(31);
/*  149:     */     
/*  150:  93 */     this.editorTextArea.setColumns(20);
/*  151:  94 */     this.editorTextArea.setRows(5);
/*  152:  95 */     this.jScrollPane1.setViewportView(this.editorTextArea);
/*  153:     */     
/*  154:  97 */     this.ACtextfield.setEditable(false);
/*  155:  98 */     this.ACtextfield.setHorizontalAlignment(0);
/*  156:  99 */     this.ACtextfield.setText("0000");
/*  157:     */     
/*  158: 101 */     this.MARtextfield.setEditable(false);
/*  159: 102 */     this.MARtextfield.setHorizontalAlignment(0);
/*  160: 103 */     this.MARtextfield.setText("000");
/*  161:     */     
/*  162: 105 */     this.MBRtextfield.setEditable(false);
/*  163: 106 */     this.MBRtextfield.setHorizontalAlignment(0);
/*  164: 107 */     this.MBRtextfield.setText("0000");
/*  165:     */     
/*  166: 109 */     this.IRtextfield.setEditable(false);
/*  167: 110 */     this.IRtextfield.setHorizontalAlignment(0);
/*  168: 111 */     this.IRtextfield.setText("0000");
/*  169:     */     
/*  170: 113 */     this.PCtextfield.setEditable(false);
/*  171: 114 */     this.PCtextfield.setHorizontalAlignment(0);
/*  172: 115 */     this.PCtextfield.setText("000");
/*  173:     */     
/*  174: 117 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/*  175: 118 */     this.jLabel1.setHorizontalAlignment(0);
/*  176: 119 */     this.jLabel1.setText("AC");
/*  177:     */     
/*  178: 121 */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/*  179: 122 */     this.jLabel6.setHorizontalAlignment(0);
/*  180: 123 */     this.jLabel6.setText("MAR");
/*  181:     */     
/*  182: 125 */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/*  183: 126 */     this.jLabel7.setHorizontalAlignment(0);
/*  184: 127 */     this.jLabel7.setText("MBR");
/*  185:     */     
/*  186: 129 */     this.jLabel8.setFont(new Font("Tahoma", 1, 14));
/*  187: 130 */     this.jLabel8.setHorizontalAlignment(0);
/*  188: 131 */     this.jLabel8.setText("IR");
/*  189:     */     
/*  190: 133 */     this.jLabel9.setFont(new Font("Tahoma", 1, 14));
/*  191: 134 */     this.jLabel9.setHorizontalAlignment(0);
/*  192: 135 */     this.jLabel9.setText("PC");
/*  193:     */     
/*  194: 137 */     this.jScrollPane2.setHorizontalScrollBarPolicy(31);
/*  195: 138 */     this.jScrollPane2.setVerticalScrollBarPolicy(21);
/*  196:     */     
/*  197: 140 */     this.addressTable.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null } }, new String[] { "", "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "+a", "+b", "+c", "+d", "+e", "+f" })
/*  198:     */     {
/*  199: 158 */       boolean[] canEdit = { false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false };
/*  200:     */       
/*  201:     */       public boolean isCellEditable(int rowIndex, int columnIndex)
/*  202:     */       {
/*  203: 163 */         return this.canEdit[columnIndex];
/*  204:     */       }
/*  205: 165 */     });
/*  206: 166 */     this.addressTable.setFocusable(false);
/*  207: 167 */     this.addressTable.getTableHeader().setReorderingAllowed(false);
/*  208: 168 */     this.jScrollPane2.setViewportView(this.addressTable);
/*  209: 169 */     this.addressTable.getColumnModel().getColumn(0).setResizable(false);
/*  210: 170 */     this.addressTable.getColumnModel().getColumn(1).setResizable(false);
/*  211: 171 */     this.addressTable.getColumnModel().getColumn(1).setPreferredWidth(100);
/*  212: 172 */     this.addressTable.getColumnModel().getColumn(2).setResizable(false);
/*  213: 173 */     this.addressTable.getColumnModel().getColumn(3).setResizable(false);
/*  214: 174 */     this.addressTable.getColumnModel().getColumn(4).setResizable(false);
/*  215: 175 */     this.addressTable.getColumnModel().getColumn(5).setResizable(false);
/*  216: 176 */     this.addressTable.getColumnModel().getColumn(6).setResizable(false);
/*  217: 177 */     this.addressTable.getColumnModel().getColumn(7).setResizable(false);
/*  218: 178 */     this.addressTable.getColumnModel().getColumn(8).setResizable(false);
/*  219: 179 */     this.addressTable.getColumnModel().getColumn(9).setResizable(false);
/*  220: 180 */     this.addressTable.getColumnModel().getColumn(10).setResizable(false);
/*  221: 181 */     this.addressTable.getColumnModel().getColumn(11).setResizable(false);
/*  222: 182 */     this.addressTable.getColumnModel().getColumn(12).setResizable(false);
/*  223: 183 */     this.addressTable.getColumnModel().getColumn(13).setResizable(false);
/*  224: 184 */     this.addressTable.getColumnModel().getColumn(14).setResizable(false);
/*  225: 185 */     this.addressTable.getColumnModel().getColumn(15).setResizable(false);
/*  226: 186 */     this.addressTable.getColumnModel().getColumn(16).setResizable(false);
/*  227:     */     
/*  228: 188 */     this.runButton.setText("Run");
/*  229: 189 */     this.runButton.setEnabled(false);
/*  230: 190 */     this.runButton.addActionListener(new ActionListener()
/*  231:     */     {
/*  232:     */       public void actionPerformed(ActionEvent evt)
/*  233:     */       {
/*  234: 192 */         MARIAui.this.runButtonActionPerformed(evt);
/*  235:     */       }
/*  236: 195 */     });
/*  237: 196 */     this.jLabel2.setText("(Hex)");
/*  238:     */     
/*  239: 198 */     this.jLabel3.setText("(Hex)");
/*  240:     */     
/*  241: 200 */     this.jLabel4.setText("(Hex)");
/*  242:     */     
/*  243: 202 */     this.jLabel5.setText("(Hex)");
/*  244:     */     
/*  245: 204 */     this.jLabel11.setText("(Hex)");
/*  246:     */     
/*  247: 206 */     this.jScrollPane3.setHorizontalScrollBarPolicy(31);
/*  248:     */     
/*  249: 208 */     this.outputTextArea.setEditable(false);
/*  250: 209 */     this.outputTextArea.setColumns(20);
/*  251: 210 */     this.outputTextArea.setRows(5);
/*  252: 211 */     this.jScrollPane3.setViewportView(this.outputTextArea);
/*  253:     */     
/*  254: 213 */     this.jLabel13.setFont(new Font("Tahoma", 1, 14));
/*  255: 214 */     this.jLabel13.setText("OUTPUT");
/*  256:     */     
/*  257: 216 */     this.jLabel12.setFont(new Font("Tahoma", 1, 14));
/*  258: 217 */     this.jLabel12.setText("Status:");
/*  259:     */     
/*  260: 219 */     this.statusTextField.setEditable(false);
/*  261: 220 */     this.statusTextField.setHorizontalAlignment(0);
/*  262: 221 */     this.statusTextField.setText("--");
/*  263:     */     
/*  264: 223 */     this.stopButton.setText("Stop");
/*  265: 224 */     this.stopButton.setEnabled(false);
/*  266: 225 */     this.stopButton.addActionListener(new ActionListener()
/*  267:     */     {
/*  268:     */       public void actionPerformed(ActionEvent evt)
/*  269:     */       {
/*  270: 227 */         MARIAui.this.stopButtonActionPerformed(evt);
/*  271:     */       }
/*  272: 230 */     });
/*  273: 231 */     this.outputHexButton.setText("Hex");
/*  274: 232 */     this.outputHexButton.setEnabled(false);
/*  275: 233 */     this.outputHexButton.addActionListener(new ActionListener()
/*  276:     */     {
/*  277:     */       public void actionPerformed(ActionEvent evt)
/*  278:     */       {
/*  279: 235 */         MARIAui.this.outputHexButtonActionPerformed(evt);
/*  280:     */       }
/*  281: 238 */     });
/*  282: 239 */     this.outputDecButton.setText("Dec");
/*  283: 240 */     this.outputDecButton.setEnabled(false);
/*  284: 241 */     this.outputDecButton.addActionListener(new ActionListener()
/*  285:     */     {
/*  286:     */       public void actionPerformed(ActionEvent evt)
/*  287:     */       {
/*  288: 243 */         MARIAui.this.outputDecButtonActionPerformed(evt);
/*  289:     */       }
/*  290: 246 */     });
/*  291: 247 */     this.jLabel10.setFont(new Font("Simplified Arabic Fixed", 0, 36));
/*  292: 248 */     this.jLabel10.setText("MARIA");
/*  293:     */     
/*  294: 250 */     this.checkButton.setText("Check");
/*  295: 251 */     this.checkButton.addActionListener(new ActionListener()
/*  296:     */     {
/*  297:     */       public void actionPerformed(ActionEvent evt)
/*  298:     */       {
/*  299: 253 */         MARIAui.this.checkButtonActionPerformed(evt);
/*  300:     */       }
/*  301: 256 */     });
/*  302: 257 */     this.jLabel14.setFont(new Font("Simplified Arabic", 0, 10));
/*  303: 258 */     this.jLabel14.setText("Machine Architecture that is Really");
/*  304:     */     
/*  305: 260 */     this.jLabel15.setFont(new Font("Simplified Arabic", 0, 10));
/*  306: 261 */     this.jLabel15.setText("Intuitive and Awesome");
/*  307:     */     
/*  308: 263 */     this.editButton.setText("Edit");
/*  309: 264 */     this.editButton.setEnabled(false);
/*  310: 265 */     this.editButton.addActionListener(new ActionListener()
/*  311:     */     {
/*  312:     */       public void actionPerformed(ActionEvent evt)
/*  313:     */       {
/*  314: 267 */         MARIAui.this.editButtonActionPerformed(evt);
/*  315:     */       }
/*  316: 270 */     });
/*  317: 271 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  318: 272 */     this.jPanel1.setLayout(jPanel1Layout);
/*  319: 273 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane1, -1, 216, 32767).addComponent(this.checkButton, -1, -1, 32767).addComponent(this.editButton, -1, -1, 32767).addComponent(this.runButton, -1, -1, 32767)).addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel6, -1, 41, 32767).addComponent(this.jLabel8, -1, -1, 32767).addComponent(this.jLabel9, -1, -1, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addComponent(this.jLabel7, GroupLayout.Alignment.TRAILING, -2, 38, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.MARtextfield).addComponent(this.ACtextfield, -1, 118, 32767).addComponent(this.MBRtextfield).addComponent(this.IRtextfield).addComponent(this.PCtextfield)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3).addComponent(this.jLabel4).addComponent(this.jLabel5).addComponent(this.jLabel11).addComponent(this.jLabel2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jScrollPane3, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(54, 54, 54).addComponent(this.jLabel13).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.outputHexButton).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.outputDecButton))).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jLabel10).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel14).addComponent(this.jLabel15))).addComponent(this.stopButton, -2, 81, -2).addComponent(this.jLabel12).addComponent(this.statusTextField, -2, 221, -2))).addComponent(this.jScrollPane2, -2, 732, -2)).addContainerGap(-1, 32767)));
/*  320:     */     
/*  321:     */ 
/*  322:     */ 
/*  323:     */ 
/*  324:     */ 
/*  325:     */ 
/*  326:     */ 
/*  327:     */ 
/*  328:     */ 
/*  329:     */ 
/*  330:     */ 
/*  331:     */ 
/*  332:     */ 
/*  333:     */ 
/*  334:     */ 
/*  335:     */ 
/*  336:     */ 
/*  337:     */ 
/*  338:     */ 
/*  339:     */ 
/*  340:     */ 
/*  341:     */ 
/*  342:     */ 
/*  343:     */ 
/*  344:     */ 
/*  345:     */ 
/*  346:     */ 
/*  347:     */ 
/*  348:     */ 
/*  349:     */ 
/*  350:     */ 
/*  351:     */ 
/*  352:     */ 
/*  353:     */ 
/*  354:     */ 
/*  355:     */ 
/*  356:     */ 
/*  357:     */ 
/*  358:     */ 
/*  359:     */ 
/*  360:     */ 
/*  361:     */ 
/*  362:     */ 
/*  363:     */ 
/*  364:     */ 
/*  365:     */ 
/*  366:     */ 
/*  367:     */ 
/*  368:     */ 
/*  369:     */ 
/*  370:     */ 
/*  371:     */ 
/*  372:     */ 
/*  373:     */ 
/*  374:     */ 
/*  375:     */ 
/*  376:     */ 
/*  377: 331 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane1).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.checkButton).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.editButton).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.runButton)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.ACtextfield, -2, 30, -2).addComponent(this.jLabel1).addComponent(this.jLabel2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel13, -1, -1, 32767).addComponent(this.outputHexButton).addComponent(this.outputDecButton))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.MARtextfield, -2, 30, -2).addComponent(this.jLabel6).addComponent(this.jLabel3)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.MBRtextfield, -2, 30, -2).addComponent(this.jLabel7).addComponent(this.jLabel4)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.IRtextfield, -2, 30, -2).addComponent(this.jLabel8).addComponent(this.jLabel5)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.PCtextfield, -2, 30, -2).addComponent(this.jLabel9).addComponent(this.jLabel11))).addComponent(this.jScrollPane3))).addGroup(jPanel1Layout.createSequentialGroup().addGap(4, 4, 4).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel10).addComponent(this.jLabel15)).addComponent(this.jLabel14)).addGap(18, 18, 18).addComponent(this.jLabel12).addGap(9, 9, 9).addComponent(this.statusTextField, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.stopButton))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane2, -2, 212, -2))).addContainerGap()));
/*  378:     */     
/*  379:     */ 
/*  380:     */ 
/*  381:     */ 
/*  382:     */ 
/*  383:     */ 
/*  384:     */ 
/*  385:     */ 
/*  386:     */ 
/*  387:     */ 
/*  388:     */ 
/*  389:     */ 
/*  390:     */ 
/*  391:     */ 
/*  392:     */ 
/*  393:     */ 
/*  394:     */ 
/*  395:     */ 
/*  396:     */ 
/*  397:     */ 
/*  398:     */ 
/*  399:     */ 
/*  400:     */ 
/*  401:     */ 
/*  402:     */ 
/*  403:     */ 
/*  404:     */ 
/*  405:     */ 
/*  406:     */ 
/*  407:     */ 
/*  408:     */ 
/*  409:     */ 
/*  410:     */ 
/*  411:     */ 
/*  412:     */ 
/*  413:     */ 
/*  414:     */ 
/*  415:     */ 
/*  416:     */ 
/*  417:     */ 
/*  418:     */ 
/*  419:     */ 
/*  420:     */ 
/*  421:     */ 
/*  422:     */ 
/*  423:     */ 
/*  424:     */ 
/*  425:     */ 
/*  426:     */ 
/*  427:     */ 
/*  428:     */ 
/*  429:     */ 
/*  430:     */ 
/*  431:     */ 
/*  432:     */ 
/*  433:     */ 
/*  434:     */ 
/*  435:     */ 
/*  436:     */ 
/*  437:     */ 
/*  438:     */ 
/*  439:     */ 
/*  440:     */ 
/*  441:     */ 
/*  442:     */ 
/*  443: 397 */     this.jMenu1.setText("File");
/*  444:     */     
/*  445: 399 */     this.restartMenuItem.setText("Restart");
/*  446: 400 */     this.restartMenuItem.addActionListener(new ActionListener()
/*  447:     */     {
/*  448:     */       public void actionPerformed(ActionEvent evt)
/*  449:     */       {
/*  450: 402 */         MARIAui.this.restartMenuItemActionPerformed(evt);
/*  451:     */       }
/*  452: 404 */     });
/*  453: 405 */     this.jMenu1.add(this.restartMenuItem);
/*  454:     */     
/*  455: 407 */     this.exitMenuItem.setText("Exit");
/*  456: 408 */     this.exitMenuItem.addActionListener(new ActionListener()
/*  457:     */     {
/*  458:     */       public void actionPerformed(ActionEvent evt)
/*  459:     */       {
/*  460: 410 */         MARIAui.this.exitMenuItemActionPerformed(evt);
/*  461:     */       }
/*  462: 412 */     });
/*  463: 413 */     this.jMenu1.add(this.exitMenuItem);
/*  464:     */     
/*  465: 415 */     this.jMenuBar1.add(this.jMenu1);
/*  466:     */     
/*  467: 417 */     setJMenuBar(this.jMenuBar1);
/*  468:     */     
/*  469: 419 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  470: 420 */     getContentPane().setLayout(layout);
/*  471: 421 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
/*  472:     */     
/*  473:     */ 
/*  474:     */ 
/*  475: 425 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
/*  476:     */     
/*  477:     */ 
/*  478:     */ 
/*  479:     */ 
/*  480:     */ 
/*  481:     */ 
/*  482: 432 */     pack();
/*  483:     */   }
/*  484:     */   
/*  485:     */   private void runButtonActionPerformed(ActionEvent evt)
/*  486:     */   {
/*  487: 436 */     this.checkButton.setEnabled(true);
/*  488: 437 */     this.editButton.setEnabled(false);
/*  489: 438 */     this.runButton.setEnabled(false);
/*  490: 439 */     this.outputDecButton.setEnabled(true);
/*  491: 440 */     this.statusTextField.setText("Running.");
/*  492: 441 */     this.stopButton.setEnabled(true);
/*  493: 442 */     executePneumonicRun();
/*  494:     */   }
/*  495:     */   
/*  496:     */   private void stopButtonActionPerformed(ActionEvent evt)
/*  497:     */   {
/*  498: 446 */     this.statusTextField.setText("Halted at user request.");
/*  499: 447 */     this.stopButton.setEnabled(false);
/*  500: 448 */     this.editorTextArea.setEnabled(true);
/*  501:     */   }
/*  502:     */   
/*  503:     */   private void exitMenuItemActionPerformed(ActionEvent evt)
/*  504:     */   {
/*  505: 452 */     System.exit(0);
/*  506:     */   }
/*  507:     */   
/*  508:     */   private void restartMenuItemActionPerformed(ActionEvent evt)
/*  509:     */   {
/*  510: 456 */     this.editorTextArea.setText("");
/*  511: 457 */     programInitialize();
/*  512:     */   }
/*  513:     */   
/*  514:     */   private void outputHexButtonActionPerformed(ActionEvent evt)
/*  515:     */   {
/*  516: 461 */     String outputText = this.outputTextArea.getText();
/*  517: 462 */     if (!outputText.equals(""))
/*  518:     */     {
/*  519: 463 */       String[] outputTextArray = outputText.split("\n");
/*  520: 464 */       String newOutput = "";
/*  521: 465 */       for (int a = 0; a < outputTextArray.length; a++) {
/*  522: 466 */         newOutput = newOutput + addZerosFour(Integer.toHexString(Integer.parseInt(outputTextArray[a]))) + "\n";
/*  523:     */       }
/*  524: 468 */       this.outputTextArea.setText(newOutput);
/*  525:     */     }
/*  526: 470 */     this.outputHexButton.setEnabled(false);
/*  527: 471 */     this.outputDecButton.setEnabled(true);
/*  528:     */   }
/*  529:     */   
/*  530:     */   private void outputDecButtonActionPerformed(ActionEvent evt)
/*  531:     */   {
/*  532: 475 */     String outputText = this.outputTextArea.getText();
/*  533: 476 */     if (!outputText.equals(""))
/*  534:     */     {
/*  535: 477 */       String[] outputTextArray = outputText.split("\n");
/*  536: 478 */       String newOutput = "";
/*  537: 479 */       for (int a = 0; a < outputTextArray.length; a++) {
/*  538: 480 */         newOutput = newOutput + this.h.convert(outputTextArray[a]) + "\n";
/*  539:     */       }
/*  540: 482 */       this.outputTextArea.setText(newOutput);
/*  541:     */     }
/*  542: 484 */     this.outputDecButton.setEnabled(false);
/*  543: 485 */     this.outputHexButton.setEnabled(true);
/*  544:     */   }
/*  545:     */   
/*  546:     */   private void checkButtonActionPerformed(ActionEvent evt)
/*  547:     */   {
/*  548: 489 */     programInitialize();
/*  549: 490 */     String pneumonic = this.editorTextArea.getText();
/*  550: 491 */     int pneumonicFirstPassCounter = 0;
/*  551: 492 */     int pneumonicSecondPassCounter = 0;
/*  552: 493 */     if (!pneumonic.equals(""))
/*  553:     */     {
/*  554: 494 */       String[] pneumonicArray = pneumonic.split("\n");
/*  555: 496 */       while (this.returnToFirstPassCounter == 0)
/*  556:     */       {
/*  557: 497 */         pneumonicFirstPassCounter = 0;
/*  558: 498 */         this.returnToFirstPassCounter = 1;
/*  559: 499 */         for (int a = 0; a < pneumonicArray.length; a++) {
/*  560: 500 */           if ((this.errorCounter == 0) && 
/*  561: 501 */             (!pneumonicArray[a].equals("")))
/*  562:     */           {
/*  563: 502 */             checkPneumonicFirstPass(pneumonicArray[a], pneumonicFirstPassCounter);
/*  564: 503 */             pneumonicFirstPassCounter++;
/*  565:     */           }
/*  566:     */         }
/*  567:     */       }
/*  568: 509 */       for (int b = 0; b < pneumonicArray.length; b++) {
/*  569: 510 */         if ((this.errorCounter == 0) && 
/*  570: 511 */           (!pneumonicArray[b].equals("")))
/*  571:     */         {
/*  572: 512 */           checkPneumonicSecondPass(pneumonicArray[b], pneumonicSecondPassCounter);
/*  573: 513 */           pneumonicSecondPassCounter++;
/*  574:     */         }
/*  575:     */       }
/*  576: 517 */       if (this.errorCounter == 0)
/*  577:     */       {
/*  578: 518 */         this.PCtextfield.setText(addZerosThree(Integer.toHexString(this.orgCounter)));
/*  579: 519 */         this.checkButton.setEnabled(false);
/*  580: 520 */         this.editorTextArea.setEnabled(false);
/*  581: 521 */         this.runButton.setEnabled(true);
/*  582: 522 */         this.statusTextField.setText("Ready to load program instructions");
/*  583: 523 */         this.editButton.setEnabled(true);
/*  584:     */       }
/*  585:     */     }
/*  586:     */     else
/*  587:     */     {
/*  588: 526 */       errorEncountered("Please input program instructions.");
/*  589:     */     }
/*  590:     */   }
/*  591:     */   
/*  592:     */   private void editButtonActionPerformed(ActionEvent evt)
/*  593:     */   {
/*  594: 531 */     this.editorTextArea.setEnabled(true);
/*  595: 532 */     this.checkButton.setEnabled(true);
/*  596: 533 */     this.editButton.setEnabled(false);
/*  597: 534 */     this.runButton.setEnabled(false);
/*  598:     */   }
/*  599:     */   
/*  600:     */   public static void main(String[] args)
/*  601:     */   {
/*  602:     */     try
/*  603:     */     {
/*  604: 547 */       for (UIManager.LookAndFeelInfo info : ) {
/*  605: 548 */         if ("Nimbus".equals(info.getName()))
/*  606:     */         {
/*  607: 549 */           UIManager.setLookAndFeel(info.getClassName());
/*  608: 550 */           break;
/*  609:     */         }
/*  610:     */       }
/*  611:     */     }
/*  612:     */     catch (ClassNotFoundException ex)
/*  613:     */     {
/*  614: 554 */       Logger.getLogger(MARIAui.class.getName()).log(Level.SEVERE, null, ex);
/*  615:     */     }
/*  616:     */     catch (InstantiationException ex)
/*  617:     */     {
/*  618: 556 */       Logger.getLogger(MARIAui.class.getName()).log(Level.SEVERE, null, ex);
/*  619:     */     }
/*  620:     */     catch (IllegalAccessException ex)
/*  621:     */     {
/*  622: 558 */       Logger.getLogger(MARIAui.class.getName()).log(Level.SEVERE, null, ex);
/*  623:     */     }
/*  624:     */     catch (UnsupportedLookAndFeelException ex)
/*  625:     */     {
/*  626: 560 */       Logger.getLogger(MARIAui.class.getName()).log(Level.SEVERE, null, ex);
/*  627:     */     }
/*  628: 565 */     EventQueue.invokeLater(new Runnable()
/*  629:     */     {
/*  630:     */       public void run()
/*  631:     */       {
/*  632:     */         try
/*  633:     */         {
/*  634: 568 */           new MARIAui().setVisible(true);
/*  635:     */         }
/*  636:     */         catch (IOException ex)
/*  637:     */         {
/*  638: 570 */           Logger.getLogger(MARIAui.class.getName()).log(Level.SEVERE, null, ex);
/*  639:     */         }
/*  640:     */       }
/*  641:     */     });
/*  642:     */   }
/*  643:     */   
/*  644:     */   public void initializeAddressTable()
/*  645:     */   {
/*  646: 577 */     for (int a = 1; a <= 10; a++) {
/*  647: 578 */       for (int b = 1; b <= 16; b++) {
/*  648: 579 */         this.addressTable.setValueAt("0000", a, b);
/*  649:     */       }
/*  650:     */     }
/*  651: 582 */     this.addressTable.setValueAt("000", 1, 0);
/*  652: 583 */     for (int c = 2; c <= 10; c++) {
/*  653: 584 */       this.addressTable.setValueAt("0" + (c - 1) * 10, c, 0);
/*  654:     */     }
/*  655:     */   }
/*  656:     */   
/*  657:     */   public void initializeRegisters()
/*  658:     */   {
/*  659: 589 */     this.ACtextfield.setText("0000");
/*  660: 590 */     this.MARtextfield.setText("000");
/*  661: 591 */     this.MBRtextfield.setText("0000");
/*  662: 592 */     this.IRtextfield.setText("0000");
/*  663: 593 */     this.PCtextfield.setText("000");
/*  664:     */   }
/*  665:     */   
/*  666:     */   public void checkPneumonicFirstPass(String pneumonic, int counter)
/*  667:     */   {
/*  668: 596 */     String[] pneumonicArray2 = pneumonic.split(", ");
/*  669: 597 */     if (pneumonicArray2.length == 2)
/*  670:     */     {
/*  671: 598 */       String[] valueArray = pneumonicArray2[1].split(" ");
/*  672: 599 */       int checkCounter = checkIfVariableTaken(pneumonicArray2[0]);
/*  673: 600 */       if (checkCounter == 0) {
/*  674: 601 */         if ((valueArray[0].equals("HEX")) || (valueArray[0].equals("hex")))
/*  675:     */         {
/*  676: 602 */           this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  677: 603 */           this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  678: 604 */           this.variablesCounter += 1;
/*  679: 605 */           storePneumonic(addZerosFour(valueArray[1]), counter);
/*  680:     */         }
/*  681: 606 */         else if ((valueArray[0].equals("DEC")) || (valueArray[0].equals("dec")))
/*  682:     */         {
/*  683: 607 */           String hexiEquivalent = Integer.toHexString(Integer.parseInt(valueArray[1]));
/*  684: 608 */           this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  685: 609 */           this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  686: 610 */           this.variablesCounter += 1;
/*  687: 611 */           storePneumonic(addZerosFour(hexiEquivalent), counter);
/*  688:     */         }
/*  689: 612 */         else if ((valueArray[0].equals("OUTPUT")) || (valueArray[0].equals("output")))
/*  690:     */         {
/*  691: 613 */           this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  692: 614 */           this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  693: 615 */           this.variablesCounter += 1;
/*  694: 616 */           storePneumonic("b000", counter);
/*  695:     */         }
/*  696: 617 */         else if ((valueArray[0].equals("HALT")) || (valueArray[0].equals("halt")))
/*  697:     */         {
/*  698: 618 */           this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  699: 619 */           this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  700: 620 */           this.variablesCounter += 1;
/*  701: 621 */           storePneumonic("c000", counter);
/*  702:     */         }
/*  703: 622 */         else if ((valueArray[0].equals("LOAD")) || (valueArray[0].equals("load")))
/*  704:     */         {
/*  705: 623 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  706:     */           {
/*  707: 624 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  708: 625 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  709: 626 */             this.variablesCounter += 1;
/*  710: 627 */             storePneumonic("1" + findVariable(valueArray[1]), counter);
/*  711:     */           }
/*  712:     */           else
/*  713:     */           {
/*  714: 629 */             this.returnToFirstPassCounter = 0;
/*  715:     */           }
/*  716:     */         }
/*  717: 631 */         else if ((valueArray[0].equals("STORE")) || (valueArray[0].equals("store")))
/*  718:     */         {
/*  719: 632 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  720:     */           {
/*  721: 633 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  722: 634 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  723: 635 */             this.variablesCounter += 1;
/*  724: 636 */             storePneumonic("2" + findVariable(valueArray[1]), counter);
/*  725:     */           }
/*  726:     */           else
/*  727:     */           {
/*  728: 638 */             this.returnToFirstPassCounter = 0;
/*  729:     */           }
/*  730:     */         }
/*  731: 640 */         else if ((valueArray[0].equals("ADD")) || (valueArray[0].equals("add")))
/*  732:     */         {
/*  733: 641 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  734:     */           {
/*  735: 642 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  736: 643 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  737: 644 */             this.variablesCounter += 1;
/*  738: 645 */             storePneumonic("3" + findVariable(valueArray[1]), counter);
/*  739:     */           }
/*  740:     */           else
/*  741:     */           {
/*  742: 647 */             this.returnToFirstPassCounter = 0;
/*  743:     */           }
/*  744:     */         }
/*  745: 649 */         else if ((valueArray[0].equals("SUBT")) || (valueArray[0].equals("subt")))
/*  746:     */         {
/*  747: 650 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  748:     */           {
/*  749: 651 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  750: 652 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  751: 653 */             this.variablesCounter += 1;
/*  752: 654 */             storePneumonic("4" + findVariable(valueArray[1]), counter);
/*  753:     */           }
/*  754:     */           else
/*  755:     */           {
/*  756: 656 */             this.returnToFirstPassCounter = 0;
/*  757:     */           }
/*  758:     */         }
/*  759: 658 */         else if ((valueArray[0].equals("MULTI")) || (valueArray[0].equals("multi")))
/*  760:     */         {
/*  761: 659 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  762:     */           {
/*  763: 660 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  764: 661 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  765: 662 */             this.variablesCounter += 1;
/*  766: 663 */             storePneumonic("5" + findVariable(valueArray[1]), counter);
/*  767:     */           }
/*  768:     */           else
/*  769:     */           {
/*  770: 665 */             this.returnToFirstPassCounter = 0;
/*  771:     */           }
/*  772:     */         }
/*  773: 667 */         else if ((valueArray[0].equals("SQUARE")) || (valueArray[0].equals("square")))
/*  774:     */         {
/*  775: 668 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  776:     */           {
/*  777: 669 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  778: 670 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  779: 671 */             this.variablesCounter += 1;
/*  780: 672 */             storePneumonic("6" + findVariable(valueArray[1]), counter);
/*  781:     */           }
/*  782:     */           else
/*  783:     */           {
/*  784: 674 */             this.returnToFirstPassCounter = 0;
/*  785:     */           }
/*  786:     */         }
/*  787: 676 */         else if ((valueArray[0].equals("SKIPCOMP")) || (valueArray[0].equals("skipcomp")))
/*  788:     */         {
/*  789: 677 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  790:     */           {
/*  791: 678 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  792: 679 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  793: 680 */             this.variablesCounter += 1;
/*  794: 681 */             storePneumonic("7" + findVariable(valueArray[1]), counter);
/*  795:     */           }
/*  796:     */           else
/*  797:     */           {
/*  798: 683 */             this.returnToFirstPassCounter = 0;
/*  799:     */           }
/*  800:     */         }
/*  801: 685 */         else if ((valueArray[0].equals("JUMP")) || (valueArray[0].equals("jump")))
/*  802:     */         {
/*  803: 686 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  804:     */           {
/*  805: 687 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  806: 688 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  807: 689 */             this.variablesCounter += 1;
/*  808: 690 */             storePneumonic("8" + findVariable(valueArray[1]), counter);
/*  809:     */           }
/*  810:     */           else
/*  811:     */           {
/*  812: 692 */             this.returnToFirstPassCounter = 0;
/*  813:     */           }
/*  814:     */         }
/*  815: 694 */         else if ((valueArray[0].equals("CNJUMP")) || (valueArray[0].equals("cnjump")))
/*  816:     */         {
/*  817: 695 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  818:     */           {
/*  819: 696 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  820: 697 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  821: 698 */             this.variablesCounter += 1;
/*  822: 699 */             storePneumonic("9" + findVariable(valueArray[1]), counter);
/*  823:     */           }
/*  824:     */           else
/*  825:     */           {
/*  826: 701 */             this.returnToFirstPassCounter = 0;
/*  827:     */           }
/*  828:     */         }
/*  829: 703 */         else if ((valueArray[0].equals("INPUT")) || (valueArray[0].equals("input")))
/*  830:     */         {
/*  831: 704 */           if (!findVariableB(valueArray[1]).equals("ERROR"))
/*  832:     */           {
/*  833: 705 */             this.variablesArray[this.variablesCounter] = pneumonicArray2[0];
/*  834: 706 */             this.variableLocationsArray[this.variablesCounter] = addZerosThree(Integer.toHexString(counter));
/*  835: 707 */             this.variablesCounter += 1;
/*  836: 708 */             storePneumonic("a" + findVariable(valueArray[1]), counter);
/*  837:     */           }
/*  838:     */           else
/*  839:     */           {
/*  840: 710 */             this.returnToFirstPassCounter = 0;
/*  841:     */           }
/*  842:     */         }
/*  843:     */         else
/*  844:     */         {
/*  845: 713 */           errorEncountered("Instruction/s not recognized.");
/*  846:     */         }
/*  847:     */       }
/*  848:     */     }
/*  849:     */   }
/*  850:     */   
/*  851:     */   public void checkPneumonicSecondPass(String pneumonic, int counter)
/*  852:     */   {
/*  853: 720 */     if ((pneumonic.equals("OUTPUT")) || (pneumonic.equals("output")))
/*  854:     */     {
/*  855: 721 */       storePneumonic("b000", counter);
/*  856:     */     }
/*  857: 722 */     else if ((pneumonic.equals("HALT")) || (pneumonic.equals("halt")))
/*  858:     */     {
/*  859: 723 */       storePneumonic("c000", counter);
/*  860:     */     }
/*  861:     */     else
/*  862:     */     {
/*  863: 725 */       String[] pneumonicArray = pneumonic.split(" ");
/*  864: 726 */       if (pneumonicArray.length == 2)
/*  865:     */       {
/*  866: 727 */         if ((pneumonicArray[0].equals("LOAD")) || (pneumonicArray[0].equals("load")))
/*  867:     */         {
/*  868: 728 */           if (pneumonicArray.length == 2)
/*  869:     */           {
/*  870: 729 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  871: 730 */               storePneumonic("1" + findVariable(pneumonicArray[1]), counter);
/*  872:     */             }
/*  873:     */           }
/*  874:     */           else {
/*  875: 733 */             errorEncountered("Wrong syntax for LOAD X instruction.");
/*  876:     */           }
/*  877:     */         }
/*  878: 735 */         else if ((pneumonicArray[0].equals("STORE")) || (pneumonicArray[0].equals("store")))
/*  879:     */         {
/*  880: 736 */           if (pneumonicArray.length == 2)
/*  881:     */           {
/*  882: 737 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  883: 738 */               storePneumonic("2" + findVariable(pneumonicArray[1]), counter);
/*  884:     */             }
/*  885:     */           }
/*  886:     */           else {
/*  887: 741 */             errorEncountered("Wrong syntax for STORE X instruction.");
/*  888:     */           }
/*  889:     */         }
/*  890: 743 */         else if ((pneumonicArray[0].equals("ADD")) || (pneumonicArray[0].equals("add")))
/*  891:     */         {
/*  892: 744 */           if (pneumonicArray.length == 2)
/*  893:     */           {
/*  894: 745 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  895: 746 */               storePneumonic("3" + findVariable(pneumonicArray[1]), counter);
/*  896:     */             }
/*  897:     */           }
/*  898:     */           else {
/*  899: 749 */             errorEncountered("Wrong syntax for ADD X instruction.");
/*  900:     */           }
/*  901:     */         }
/*  902: 751 */         else if ((pneumonicArray[0].equals("SUBT")) || (pneumonicArray[0].equals("subt")))
/*  903:     */         {
/*  904: 752 */           if (pneumonicArray.length == 2)
/*  905:     */           {
/*  906: 753 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  907: 754 */               storePneumonic("4" + findVariable(pneumonicArray[1]), counter);
/*  908:     */             }
/*  909:     */           }
/*  910:     */           else {
/*  911: 757 */             errorEncountered("Wrong syntax for SUBT X instruction.");
/*  912:     */           }
/*  913:     */         }
/*  914: 759 */         else if ((pneumonicArray[0].equals("MULTI")) || (pneumonicArray[0].equals("multi")))
/*  915:     */         {
/*  916: 760 */           if (pneumonicArray.length == 2)
/*  917:     */           {
/*  918: 761 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  919: 762 */               storePneumonic("5" + findVariable(pneumonicArray[1]), counter);
/*  920:     */             }
/*  921:     */           }
/*  922:     */           else {
/*  923: 765 */             errorEncountered("Wrong syntax for MULTI X instruction.");
/*  924:     */           }
/*  925:     */         }
/*  926: 767 */         else if ((pneumonicArray[0].equals("SQUARE")) || (pneumonicArray[0].equals("square")))
/*  927:     */         {
/*  928: 768 */           if (pneumonicArray.length == 2)
/*  929:     */           {
/*  930: 769 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  931: 770 */               storePneumonic("6" + findVariable(pneumonicArray[1]), counter);
/*  932:     */             }
/*  933:     */           }
/*  934:     */           else {
/*  935: 773 */             errorEncountered("Wrong syntax for SQUARE X instruction.");
/*  936:     */           }
/*  937:     */         }
/*  938: 775 */         else if ((pneumonicArray[0].equals("SKIPCOMP")) || (pneumonicArray[0].equals("skipcomp")))
/*  939:     */         {
/*  940: 776 */           if (pneumonicArray.length == 2)
/*  941:     */           {
/*  942: 777 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  943: 778 */               storePneumonic("7" + findVariable(pneumonicArray[1]), counter);
/*  944:     */             }
/*  945:     */           }
/*  946:     */           else {
/*  947: 781 */             errorEncountered("Wrong syntax for SKIPCOMP X instruction.");
/*  948:     */           }
/*  949:     */         }
/*  950: 783 */         else if ((pneumonicArray[0].equals("JUMP")) || (pneumonicArray[0].equals("jump")))
/*  951:     */         {
/*  952: 784 */           if (pneumonicArray.length == 2)
/*  953:     */           {
/*  954: 785 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  955: 786 */               storePneumonic("8" + findVariable(pneumonicArray[1]), counter);
/*  956:     */             }
/*  957:     */           }
/*  958:     */           else {
/*  959: 789 */             errorEncountered("Wrong syntax for JUMP X instruction.");
/*  960:     */           }
/*  961:     */         }
/*  962: 791 */         else if ((pneumonicArray[0].equals("CNJUMP")) || (pneumonicArray[0].equals("cnjump")))
/*  963:     */         {
/*  964: 792 */           if (pneumonicArray.length == 2)
/*  965:     */           {
/*  966: 793 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  967: 794 */               storePneumonic("9" + findVariable(pneumonicArray[1]), counter);
/*  968:     */             }
/*  969:     */           }
/*  970:     */           else {
/*  971: 797 */             errorEncountered("Wrong syntax for CNJUMP X instruction.");
/*  972:     */           }
/*  973:     */         }
/*  974: 799 */         else if ((pneumonicArray[0].equals("INPUT")) || (pneumonicArray[0].equals("input")))
/*  975:     */         {
/*  976: 800 */           if (pneumonicArray.length == 2)
/*  977:     */           {
/*  978: 801 */             if (!findVariable(pneumonicArray[1]).equals("ERROR")) {
/*  979: 802 */               storePneumonic("a" + findVariable(pneumonicArray[1]), counter);
/*  980:     */             }
/*  981:     */           }
/*  982:     */           else {
/*  983: 805 */             errorEncountered("Wrong syntax for INPUT X instruction.");
/*  984:     */           }
/*  985:     */         }
/*  986: 808 */         else if ((!pneumonicArray[1].equals("OUTPUT")) && (!pneumonicArray[1].equals("output")) && (!pneumonicArray[1].equals("HALT")) && (!pneumonicArray[1].equals("halt"))) {
/*  987: 812 */           errorEncountered("Instruction/s not recognized.");
/*  988:     */         }
/*  989:     */       }
/*  990:     */       else {
/*  991:     */         try
/*  992:     */         {
/*  993: 817 */           String[] pneumonicArray2 = pneumonic.split(", ");
/*  994: 818 */           String[] pneumonicArray3 = pneumonicArray2[1].split(" ");
/*  995: 819 */           if (pneumonicArray3.length != 2) {
/*  996: 820 */             errorEncountered("Instruction/s not recognized.");
/*  997:     */           }
/*  998:     */         }
/*  999:     */         catch (ArrayIndexOutOfBoundsException ex)
/* 1000:     */         {
/* 1001: 823 */           errorEncountered("Instruction/s not recognized.");
/* 1002:     */         }
/* 1003:     */       }
/* 1004:     */     }
/* 1005:     */   }
/* 1006:     */   
/* 1007:     */   public String findVariable(String variable)
/* 1008:     */   {
/* 1009: 830 */     int findCounter = 0;
/* 1010: 831 */     String variableLocation = "";
/* 1011: 832 */     for (int a = 0; a < this.variablesArray.length; a++) {
/* 1012: 833 */       if (variable.equals(this.variablesArray[a]))
/* 1013:     */       {
/* 1014: 834 */         variableLocation = this.variableLocationsArray[a];
/* 1015: 835 */         findCounter = 1;
/* 1016: 836 */         break;
/* 1017:     */       }
/* 1018:     */     }
/* 1019: 839 */     if (findCounter == 0)
/* 1020:     */     {
/* 1021: 840 */       errorEncountered("Cannot find variable " + variable);
/* 1022: 841 */       variableLocation = "ERROR";
/* 1023:     */     }
/* 1024: 843 */     return variableLocation;
/* 1025:     */   }
/* 1026:     */   
/* 1027:     */   public String findVariableB(String variable)
/* 1028:     */   {
/* 1029: 847 */     int findCounter = 0;
/* 1030: 848 */     String variableLocation = "";
/* 1031: 849 */     for (int a = 0; a < this.variablesArray.length; a++) {
/* 1032: 850 */       if (variable.equals(this.variablesArray[a]))
/* 1033:     */       {
/* 1034: 851 */         variableLocation = this.variableLocationsArray[a];
/* 1035: 852 */         findCounter = 1;
/* 1036: 853 */         break;
/* 1037:     */       }
/* 1038:     */     }
/* 1039: 856 */     if (findCounter == 0) {
/* 1040: 857 */       variableLocation = "ERROR";
/* 1041:     */     }
/* 1042: 859 */     return variableLocation;
/* 1043:     */   }
/* 1044:     */   
/* 1045:     */   public void errorEncountered(String error)
/* 1046:     */   {
/* 1047: 864 */     JOptionPane.showMessageDialog(null, error, "Error", 0);
/* 1048: 865 */     programInitialize();
/* 1049: 866 */     this.errorCounter = 1;
/* 1050:     */   }
/* 1051:     */   
/* 1052:     */   public void storePneumonic(String pneumonic, int counter)
/* 1053:     */   {
/* 1054: 870 */     if ((counter + 1) % 16 != 0) {
/* 1055: 871 */       this.addressTable.setValueAt(pneumonic, counter / 16 + 1, (counter + 1) % 16);
/* 1056:     */     } else {
/* 1057: 873 */       this.addressTable.setValueAt(pneumonic, counter / 16 + 1, 16);
/* 1058:     */     }
/* 1059:     */   }
/* 1060:     */   
/* 1061:     */   public void executePneumonicRun()
/* 1062:     */   {
/* 1063: 878 */     int executionCounter = 0;
/* 1064: 879 */     while (this.haltCounter == 0)
/* 1065:     */     {
/* 1066: 880 */       fetch();
/* 1067: 881 */       decodeANDexecute();
/* 1068: 882 */       executionCounter++;
/* 1069: 883 */       if (executionCounter == 1000) {
/* 1070: 884 */         errorEncountered("Instruction HALT can't be reached");
/* 1071:     */       }
/* 1072:     */     }
/* 1073:     */   }
/* 1074:     */   
/* 1075:     */   public void fetch()
/* 1076:     */   {
/* 1077: 891 */     this.MARtextfield.setText(this.PCtextfield.getText());
/* 1078:     */     
/* 1079:     */ 
/* 1080: 894 */     int MAR = this.h.convert(this.MARtextfield.getText());
/* 1081: 895 */     if ((MAR + 1) % 16 != 0) {
/* 1082: 896 */       this.IRtextfield.setText("" + this.addressTable.getValueAt(MAR / 16 + 1, (MAR + 1) % 16));
/* 1083:     */     } else {
/* 1084: 898 */       this.IRtextfield.setText("" + this.addressTable.getValueAt(MAR / 16 + 1, 16));
/* 1085:     */     }
/* 1086: 902 */     String hexadecimal = this.PCtextfield.getText();
/* 1087: 903 */     int decimal = this.h.convert(hexadecimal);
/* 1088: 904 */     decimal += 1;
/* 1089: 905 */     this.PCtextfield.setText(addZerosThree(Integer.toHexString(decimal)));
/* 1090:     */   }
/* 1091:     */   
/* 1092:     */   public void decodeANDexecute()
/* 1093:     */   {
/* 1094: 909 */     String IR = this.IRtextfield.getText();
/* 1095: 910 */     if (IR.equals("b000"))
/* 1096:     */     {
/* 1097: 911 */       if (this.outputTextArea.getText().equals("")) {
/* 1098: 912 */         this.outputTextArea.setText(this.ACtextfield.getText());
/* 1099:     */       } else {
/* 1100: 914 */         this.outputTextArea.setText(this.outputTextArea.getText() + "\n" + this.ACtextfield.getText());
/* 1101:     */       }
/* 1102:     */     }
/* 1103: 916 */     else if (IR.equals("c000"))
/* 1104:     */     {
/* 1105: 917 */       this.statusTextField.setText("Machine halted normally.");
/* 1106: 918 */       this.stopButton.setEnabled(false);
/* 1107: 919 */       this.editorTextArea.setEnabled(true);
/* 1108: 920 */       this.haltCounter = 1;
/* 1109:     */     }
/* 1110:     */     else
/* 1111:     */     {
/* 1112: 923 */       String variableLocation = "";
/* 1113: 924 */       for (int a = 1; a <= 3; a++) {
/* 1114: 925 */         variableLocation = variableLocation + IR.charAt(a);
/* 1115:     */       }
/* 1116: 927 */       this.MARtextfield.setText(variableLocation);
/* 1117:     */       
/* 1118:     */ 
/* 1119: 930 */       String operation = "" + IR.charAt(0);
/* 1120: 931 */       if (operation.equals("1"))
/* 1121:     */       {
/* 1122: 933 */         valueMARtoMBR();
/* 1123:     */         
/* 1124:     */ 
/* 1125: 936 */         this.ACtextfield.setText(this.MBRtextfield.getText());
/* 1126:     */       }
/* 1127: 937 */       else if (operation.equals("2"))
/* 1128:     */       {
/* 1129: 939 */         this.MBRtextfield.setText(this.ACtextfield.getText());
/* 1130:     */         
/* 1131:     */ 
/* 1132: 942 */         int variableLocationDecimal = this.h.convert(this.MARtextfield.getText());
/* 1133: 943 */         if ((variableLocationDecimal + 1) % 16 != 0) {
/* 1134: 944 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, (variableLocationDecimal + 1) % 16);
/* 1135:     */         } else {
/* 1136: 946 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, 16);
/* 1137:     */         }
/* 1138:     */       }
/* 1139: 948 */       else if (operation.equals("3"))
/* 1140:     */       {
/* 1141: 950 */         valueMARtoMBR();
/* 1142:     */         
/* 1143:     */ 
/* 1144: 953 */         String previousAC = this.ACtextfield.getText();
/* 1145: 954 */         int previousACDecimal = this.h.convert(previousAC);
/* 1146: 955 */         int MBRDecimal = this.h.convert(this.MBRtextfield.getText());
/* 1147: 956 */         this.ACtextfield.setText(addZerosFour(Integer.toHexString(previousACDecimal + MBRDecimal)));
/* 1148:     */       }
/* 1149: 957 */       else if (operation.equals("4"))
/* 1150:     */       {
/* 1151: 959 */         valueMARtoMBR();
/* 1152:     */         
/* 1153:     */ 
/* 1154: 962 */         String previousAC = this.ACtextfield.getText();
/* 1155: 963 */         int previousACDecimal = this.h.convert(previousAC);
/* 1156: 964 */         int MBRDecimal = this.h.convert(this.MBRtextfield.getText());
/* 1157: 965 */         this.ACtextfield.setText(addZerosFour(Integer.toHexString(previousACDecimal - MBRDecimal)));
/* 1158:     */       }
/* 1159: 966 */       else if (operation.equals("5"))
/* 1160:     */       {
/* 1161: 968 */         valueMARtoMBR();
/* 1162:     */         
/* 1163:     */ 
/* 1164: 971 */         String previousAC = this.ACtextfield.getText();
/* 1165: 972 */         int previousACDecimal = this.h.convert(previousAC);
/* 1166: 973 */         int MBRDecimal = this.h.convert(this.MBRtextfield.getText());
/* 1167: 974 */         this.ACtextfield.setText(addZerosFour(Integer.toHexString(previousACDecimal * MBRDecimal)));
/* 1168:     */       }
/* 1169: 975 */       else if (operation.equals("6"))
/* 1170:     */       {
/* 1171: 977 */         int ACDeci = this.h.convert(this.ACtextfield.getText());
/* 1172: 978 */         int squareDeci = ACDeci * ACDeci;
/* 1173: 979 */         this.ACtextfield.setText(addZerosFour(Integer.toHexString(squareDeci)));
/* 1174:     */         
/* 1175:     */ 
/* 1176: 982 */         this.MBRtextfield.setText(this.ACtextfield.getText());
/* 1177:     */         
/* 1178:     */ 
/* 1179: 985 */         int variableLocationDecimal = this.h.convert(this.MARtextfield.getText());
/* 1180: 986 */         if ((variableLocationDecimal + 1) % 16 != 0) {
/* 1181: 987 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, (variableLocationDecimal + 1) % 16);
/* 1182:     */         } else {
/* 1183: 989 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, 16);
/* 1184:     */         }
/* 1185:     */       }
/* 1186: 991 */       else if (operation.equals("7"))
/* 1187:     */       {
/* 1188: 992 */         int ACvalue = this.h.convert(this.ACtextfield.getText());
/* 1189: 993 */         valueMARtoMBR();
/* 1190: 994 */         int Xvalue = this.h.convert(this.MBRtextfield.getText());
/* 1191: 995 */         if (ACvalue > Xvalue)
/* 1192:     */         {
/* 1193: 997 */           String hexadecimal = this.PCtextfield.getText();
/* 1194: 998 */           int decimal = this.h.convert(hexadecimal);
/* 1195: 999 */           decimal += 1;
/* 1196:1000 */           this.PCtextfield.setText(addZerosThree(Integer.toHexString(decimal)));
/* 1197:     */         }
/* 1198:     */       }
/* 1199:1002 */       else if (operation.equals("8"))
/* 1200:     */       {
/* 1201:1004 */         this.PCtextfield.setText(this.MARtextfield.getText());
/* 1202:     */       }
/* 1203:1005 */       else if (operation.equals("9"))
/* 1204:     */       {
/* 1205:1006 */         String hold = this.MARtextfield.getText();
/* 1206:     */         
/* 1207:1008 */         initializeRegisters();
/* 1208:     */         
/* 1209:     */ 
/* 1210:1011 */         this.PCtextfield.setText(hold);
/* 1211:     */       }
/* 1212:1014 */       else if (operation.equals("a"))
/* 1213:     */       {
/* 1214:1015 */         String inputString = "";
/* 1215:1016 */         int inputInteger = 0;
/* 1216:1018 */         while (inputString.equals(""))
/* 1217:     */         {
/* 1218:1019 */           inputString = JOptionPane.showInputDialog(null, "Enter input (DEC): ", "Input", 0);
/* 1219:     */           try
/* 1220:     */           {
/* 1221:1021 */             inputInteger = Integer.parseInt(inputString);
/* 1222:     */           }
/* 1223:     */           catch (NumberFormatException ex)
/* 1224:     */           {
/* 1225:1023 */             inputString = "";
/* 1226:     */           }
/* 1227:     */         }
/* 1228:1028 */         this.ACtextfield.setText(addZerosFour(Integer.toHexString(inputInteger)));
/* 1229:     */         
/* 1230:     */ 
/* 1231:1031 */         this.MBRtextfield.setText(this.ACtextfield.getText());
/* 1232:     */         
/* 1233:     */ 
/* 1234:1034 */         int variableLocationDecimal = this.h.convert(this.MARtextfield.getText());
/* 1235:1035 */         if ((variableLocationDecimal + 1) % 16 != 0) {
/* 1236:1036 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, (variableLocationDecimal + 1) % 16);
/* 1237:     */         } else {
/* 1238:1038 */           this.addressTable.setValueAt(this.MBRtextfield.getText(), variableLocationDecimal / 16 + 1, 16);
/* 1239:     */         }
/* 1240:     */       }
/* 1241:     */       else
/* 1242:     */       {
/* 1243:1041 */         int addressDecimal = this.h.convert(this.PCtextfield.getText()) - 1;
/* 1244:1042 */         errorEncountered("Cannot decode instruction at " + addZerosThree(Integer.toHexString(addressDecimal)));
/* 1245:1043 */         this.haltCounter = 1;
/* 1246:     */       }
/* 1247:     */     }
/* 1248:     */   }
/* 1249:     */   
/* 1250:     */   public void valueMARtoMBR()
/* 1251:     */   {
/* 1252:1049 */     int variableLocationDecimal = this.h.convert(this.MARtextfield.getText());
/* 1253:     */     String value;
/* 1254:     */     String value;
/* 1255:1051 */     if ((variableLocationDecimal + 1) % 16 != 0) {
/* 1256:1052 */       value = "" + this.addressTable.getValueAt(variableLocationDecimal / 16 + 1, (variableLocationDecimal + 1) % 16);
/* 1257:     */     } else {
/* 1258:1054 */       value = "" + this.addressTable.getValueAt(variableLocationDecimal / 16 + 1, 16);
/* 1259:     */     }
/* 1260:1056 */     this.MBRtextfield.setText(value);
/* 1261:     */   }
/* 1262:     */   
/* 1263:     */   public String addZerosThree(String value)
/* 1264:     */   {
/* 1265:1060 */     switch (value.length())
/* 1266:     */     {
/* 1267:     */     case 1: 
/* 1268:1061 */       return "00" + value;
/* 1269:     */     case 2: 
/* 1270:1062 */       return "0" + value;
/* 1271:     */     case 3: 
/* 1272:1063 */       return value;
/* 1273:     */     }
/* 1274:1064 */     return "";
/* 1275:     */   }
/* 1276:     */   
/* 1277:     */   public String addZerosFour(String value)
/* 1278:     */   {
/* 1279:1069 */     switch (value.length())
/* 1280:     */     {
/* 1281:     */     case 1: 
/* 1282:1070 */       return "000" + value;
/* 1283:     */     case 2: 
/* 1284:1071 */       return "00" + value;
/* 1285:     */     case 3: 
/* 1286:1072 */       return "0" + value;
/* 1287:     */     case 4: 
/* 1288:1073 */       return value;
/* 1289:     */     }
/* 1290:1074 */     return "";
/* 1291:     */   }
/* 1292:     */   
/* 1293:     */   public int checkIfVariableTaken(String var)
/* 1294:     */   {
/* 1295:     */     try
/* 1296:     */     {
/* 1297:1080 */       int counter = 0;
/* 1298:1081 */       for (int a = 0; a < this.variablesArray.length; a++) {
/* 1299:1082 */         if (this.variablesArray[a].equals(var))
/* 1300:     */         {
/* 1301:1083 */           counter = 1;
/* 1302:1084 */           break;
/* 1303:     */         }
/* 1304:     */       }
/* 1305:1087 */       return counter;
/* 1306:     */     }
/* 1307:     */     catch (NullPointerException ex) {}
/* 1308:1089 */     return 0;
/* 1309:     */   }
/* 1310:     */   
/* 1311:     */   public void programInitialize()
/* 1312:     */   {
/* 1313:1094 */     initializeAddressTable();
/* 1314:1095 */     initializeRegisters();
/* 1315:1096 */     this.editorTextArea.setEnabled(true);
/* 1316:1097 */     this.checkButton.setEnabled(true);
/* 1317:1098 */     this.editButton.setEnabled(false);
/* 1318:1099 */     this.runButton.setEnabled(false);
/* 1319:1100 */     this.statusTextField.setText("--");
/* 1320:1101 */     this.stopButton.setEnabled(false);
/* 1321:1102 */     this.outputHexButton.setEnabled(false);
/* 1322:1103 */     this.outputDecButton.setEnabled(false);
/* 1323:1104 */     this.outputTextArea.setText("");
/* 1324:1105 */     this.variablesArray = new String[100];
/* 1325:1106 */     this.variableLocationsArray = new String[100];
/* 1326:1107 */     this.variablesCounter = 0;
/* 1327:1108 */     this.errorCounter = 0;
/* 1328:1109 */     this.orgCounter = 0;
/* 1329:1110 */     this.haltCounter = 0;
/* 1330:1111 */     this.returnToFirstPassCounter = 0;
/* 1331:     */   }
/* 1332:     */ }


/* Location:           C:\Users\acvillalon\Downloads\MARIA_Simulator.jar.jar
 * Qualified Name:     maria.MARIAui
 * JD-Core Version:    0.7.0.1
 */