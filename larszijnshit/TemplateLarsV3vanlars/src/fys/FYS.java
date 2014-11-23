package fys;


public class FYS {

    public static void main(String[] args) {
        Container container = new Container();//Create the container JFrame that will hold the panels.
        container.setVisible(true);//Set the container to visible.
        
//        NewAccount_Page new_account = new NewAccount_Page();//Create the New Account JPanel.
//        container.add(new_account);//Set the New Account JPanel into the container.
//        container.pack();//Make sure the container is sized correctly.
//        container.repaint();//Make sure all the elements in the container show correctly.
//        new_account.setVisible(true);//Set the New Account JPanel to visible.
//        
//        Login new_account1 = new Login();        container.add(new_account1);//Set the New Account JPanel into the container.
//        container.pack();//Make sure the container is sized correctly.
//        container.repaint();//Make sure all the elements in the container show correctly.
//        new_account1.setVisible(true);//Set the New Account JPanel to visibl
        
        NewCaseBagage new_account2 = new NewCaseBagage();        container.add(new_account2);//Set the New Account JPanel into the container.
        container.pack();//Make sure the container is sized correctly.
        container.repaint();//Make sure all the elements in the container show correctly.
        new_account2.setVisible(true);//Set the New Account JPanel to visibl
        
        
    }
    
}
