import java.sql.*;

class Program_51
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/freepdb1","system","sharvin123");

        Statement stmt = con.createStatement();

        stmt.executeUpdate("CREATE TABLE Department(" +
                "dno NUMBER PRIMARY KEY, " +
                "dname VARCHAR2(20), " +
                "dloc VARCHAR2(20))");

        stmt.executeUpdate("CREATE TABLE Emp(" +
                "eno NUMBER PRIMARY KEY, " +
                "ename VARCHAR2(20), " +
                "esal NUMBER, " +
                "dno NUMBER REFERENCES Department(dno))");

        stmt.executeUpdate("INSERT INTO Department VALUES(10,'MCA','MB')");
        stmt.executeUpdate("INSERT INTO Department VALUES(20,'MSW','OB')");

        stmt.executeUpdate("INSERT INTO Emp VALUES(1,'abc',10000,10)");
        stmt.executeUpdate("INSERT INTO Emp VALUES(2,'bcd',20000,20)");

        System.out.println("Tables created and data inserted successfully.\n");

        ResultSet rs = stmt.executeQuery(
            "SELECT e.eno, e.ename, e.esal, d.dname, d.dloc " +
            "FROM Emp e JOIN Department d ON e.dno = d.dno");

        System.out.println("eno\tename\tesal\tdname\tdloc");
        System.out.println("---------------------------------------------");

        while(rs.next())
        {
            System.out.println(
                rs.getInt(1) + "\t" +
                rs.getString(2) + "\t" +
                rs.getInt(3) + "\t" +
                rs.getString(4) + "\t" +
                rs.getString(5)
            );
        }

        con.close();
    }
}