import java.sql.*;

class Program_52
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521/freepdb1", "system","sharvin123");

        PreparedStatement psDept = con.prepareStatement(
                "INSERT INTO Department VALUES(?,?,?)");

        psDept.setInt(1, 70);
        psDept.setString(2, "MBA");
        psDept.setString(3, "CB");
        psDept.executeUpdate();

        psDept.setInt(1, 80);
        psDept.setString(2, "BCA");
        psDept.setString(3, "NB");
        psDept.executeUpdate();

        PreparedStatement psEmp = con.prepareStatement(
                "INSERT INTO Emp VALUES(?,?,?,?)");

        psEmp.setInt(1, 3);
        psEmp.setString(2, "john");
        psEmp.setInt(3, 25000);
        psEmp.setInt(4, 70);
        psEmp.executeUpdate();

        psEmp.setInt(1, 4);
        psEmp.setString(2, "rita");
        psEmp.setInt(3, 30000);
        psEmp.setInt(4, 80);
        psEmp.executeUpdate();

        System.out.println("New records inserted using PreparedStatement.\n");

        CallableStatement cs = con.prepareCall("{call getEmpDept}");
        cs.execute();

        System.out.println("\nStored Procedure executed successfully.");

        Statement stmt = con.createStatement();
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