public class Horario {
    public static void main(String[] args) {
        String prog = "\033[35mProgamación\033[0m";
        String ent = "\033[31mED\033[0m";
        String bd = "\033[32mBBDD\033[0m";
        String dig = "\033[34mDigitalización\033[0m";
        String sos = "\033[33mSostenibilidad\033[0m";
        String lm = "\033[mLeng de Marcas\033[0m";
        String si = "\033[36mSistemas\033[0m";
        String ipe = "\033[mEmpleabiliad\033[0m";
        System.out.println("*----------------------------------------------------------------------------------------------*");
        System.out.println("| Hora  |      Lunes     |     Martes     |    Miércoles    |      Jueves    |     Viernes     |");
        System.out.println("| 08:15 |       " + ent +"       |      " + bd + "      |      " + bd + "       |   " + prog + "  |     " +si + "    |  ");
        System.out.println("| 09:15 |       " + ent +"       |      " + bd + "      |      " + bd + "       |   " + prog + "  |     " +si + "    |  ");
        System.out.println("| 10:15 |       " + ent +"       | " + dig + " | " + sos + "  | " + lm + " |     " +si + "    |  ");
        System.out.println("| 11:45 |   " + prog +"  |   " + prog + "  | " + lm + "  | " + lm + " |   " +ipe + "  |  ");
        System.out.println("| 12:45 |   " + prog +"  |   " + prog + "  |     " + si + "    |      " + bd + "      |   " +ipe + "  |  ");
        System.out.println("| 13:45 |   " + prog +"  |   " + prog + "  |     " + si + "    |      " + bd + "      |   " +ipe + "  |  ");
        System.out.println("*----------------------------------------------------------------------------------------------*");

    }
    
}
