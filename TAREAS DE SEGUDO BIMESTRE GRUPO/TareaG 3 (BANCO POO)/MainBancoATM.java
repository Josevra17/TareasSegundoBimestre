package EjercicioBancoATM;

import javax.swing.JOptionPane;

public class MainBancoATM {

    static CuentaCorriente cntco = new CuentaCorriente(23874263, 500, "Cuenta Corriente", "Jose Vasquez");
    static TransaccionContraseña pin = new TransaccionContraseña(2309, 1234);
    static CajaAhorro cajah = new CajaAhorro(112475632, 300, "Cuenta de Ahorros", "Jose Vasquez");
    static TransaccionRetiroDi retiro = new TransaccionRetiroDi(200);
    static TransaccionConsulta cnsul = new TransaccionConsulta("Consulta");
    static TransaccionTransferencia trans = new TransaccionTransferencia(800.00, 23874263);
    static String m = "";

    static int n = 1;
    static int cont = 2309;

    public static void main(String[] args) {

        int c, p, opcion, opcion2 = 0, op1;

        JOptionPane.showMessageDialog(null, m = m + "                                       BUENAS TARDES\n"
                + "BIENVENIDO A LOS CAJEROS AUTOMATICOS DEL BANCO PICHINCHA\n");
        try {
            c = Integer.parseInt(JOptionPane.showInputDialog(m = m + "POR FAVOR\n"
                    + "INGRESE SU CONTRASEÑA\n"
                    + "======================================\n"));
            if (cont == c) {
                p = 1;
                JOptionPane.showMessageDialog(null, m = m + "BIEVENIDO\n"
                        + "VERIFICANDO ESPERE....\n"
                        + "======================================\n");
            } else {
                p = 0;
                c = Integer.parseInt(JOptionPane.showInputDialog("CONTRASEÑA INCORRECTA\n"
                        + "POR FAVOR\n"
                        + "INGRESE SU CONTRASEÑA NUEVAMENTE\n"
                        + "======================================\n"
                        + "Le queda 2 Intentos"));
                if (cont == c) {
                    p = 1;
                    JOptionPane.showMessageDialog(null, m = m + "BIEVENIDO\n"
                            + "VERIFICANDO ESPERE....\n"
                            + "======================================\n");
                } else {
                    p = 0;
                    c = Integer.parseInt(JOptionPane.showInputDialog("CONTRASEÑA INCORRECTA\n"
                            + "POR FAVOR\n"
                            + "INGRESE SU CONTRASEÑA NUEVAMENTE\n"
                            + "======================================\n"
                            + "Le queda 1 Intento"));
                    if (c == cont) {
                        p = 1;
                        JOptionPane.showMessageDialog(null, m = m+"BIEVENIDO\n"
                                + "VERIFICANDO ESPERE....\n"
                                + "======================================\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "POR FAVOR ACERCARSE CON LA BREVEDAD PROSIBLE A NUESTRAS OFICINAS");
                    }
                }
            }

            if (p == 1) {
                op1 = Integer.parseInt(JOptionPane.showInputDialog(null, m = m + "\n"
                        + "ELIJA SU OPCION\n"
                        + "1. CUENTA CORRIENTE\n"
                        + "2. CUENTA DE AHORROS\n"
                        + "3. SALIR"));
                if (op1 == 1) {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                ""
                                + "1. DEPOSITO\n"
                                + "2. RETIRO\n"
                                + "3. Salir"));
                        switch (opcion) {
                            case 1 -> {
                                DepositoCorriente();
                                opcion = 3;
                            }
                            case 2 -> {
                                RetiroCorriente();
                                opcion = 3;
                            }
                            case 3 -> {
                                JOptionPane.showMessageDialog(null, "SALIENDO...");
                               

                            }

                        }

                        JOptionPane.showMessageDialog(null, "SALIENDO...");

                    } while (opcion != 3);

                } else {
                    if (op1 == 2) {
                        do {
                            opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                    + "1. DEPOSITO\n"
                                    + "2. RETIRO\n"
                                    + "3. SALIR"));
                            switch (opcion2) {
                                case 1 -> {
                                    DepositoAhorro();
                                    opcion = 3;
                                }
                                case 2 -> {
                                    RetiroAhorro();
                                    opcion = 3;
                                }
                                case 3 -> {
                                    JOptionPane.showMessageDialog(null, "SALIENDO...");

                                    opcion = 3;
                                }

                                default -> {
                                    JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE UNA OPCION VALIDA\n");
                                }
                            }

                        } while (op1 == 3);
                    } else {
                        JOptionPane.showMessageDialog(null, "GRACIAS POR UTILIZAR NUESTROS SERVICIOS");

                    }
                }

            }
        } catch (java.lang.NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "VALORES INCORRECTOS");
        }

    }

    public static void RetiroAhorro() {
        int j = 0;
        while (j == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea retirar", "RETIRO", JOptionPane.QUESTION_MESSAGE));
                if (r >= 5 && r <= cntco.getSaldo()) {
                    retiro.setMonto(r);
                    cntco.Debito(r);
                    JOptionPane.showMessageDialog(null, "RETIRO EXITOSO");
                    j = 1;
                } else {
                    if (r > cntco.getSaldo()) {
                        JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 5) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITE RETIROS DE DE 5$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (NullPointerException ex) {
                j = 1;
                n = 2;
            }
        }

    }

    public static void RetiroCorriente() {
        int j = 0;
        while (j == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea retirar", "RETIRO", JOptionPane.QUESTION_MESSAGE));
                if (r >= 10 && r <= cntco.getSaldo()) {
                    retiro.setMonto(r);
                    cntco.Debito(r);
                    JOptionPane.showMessageDialog(null, "RETIRO EXITOSO");
                    j = 1;
                } else {
                    if (r > cntco.getSaldo()) {
                        JOptionPane.showMessageDialog(null, "FONDOS INSUFICIENTES", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r <10) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITE RETIROS DE DE 10$ HACIA DELANTE", "RETIRO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
            } catch (NullPointerException ex) {
                j = 1;
                n = 2;
            }
        }

    }

    public static void DepositoCorriente() {
        int i = 0;
        while (i == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea depositar", "DEPOSITO", JOptionPane.QUESTION_MESSAGE));
                if (r > 10 && r <= 1000) {
                    retiro.getMonto();
                    cntco.Credito(r);
                    JOptionPane.showMessageDialog(null, "DEPOSITO EXITOSO");
                    i = 1;
                } else {
                    if (r > 1000) {
                        JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 10) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS DE 10$ HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            } catch (NullPointerException ex) {
                i = 1;
                n = 2;
            }
        }
    }

    public static void DepositoAhorro() {
        int i = 0;
        while (i == 0) {
            double r;
            try {
                r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea depositar", "DEPOSITO", JOptionPane.QUESTION_MESSAGE));
                if (r >=10 && r <= 1000) {
                    retiro.getMonto();
                    cajah.Credito(r);
                    JOptionPane.showMessageDialog(null, "DEPOSITO EXITOSO");
                    i = 1;
                } else {
                    if (r > 1000) {
                        JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (r < 10) {
                            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN DEPOSITOS DE 10$ HASTA 1000$ ", "DEPOSITO FALLIDO", JOptionPane.WARNING_MESSAGE);
                        }
                    }

                }
            } catch (NullPointerException ex) {
                i = 1;
                n = 2;
            }
        }
    }
    
}
