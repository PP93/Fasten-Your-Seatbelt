package fys;


public class FYS {

    public static void main(String[] args) {
        Container container = new Container();//Create the container JFrame that will hold the panels.
        container.setVisible(true);//Set the container to visible.
        
        AppMan_NewAccount new_account = new AppMan_NewAccount();//Create the New Account JPanel.
        container.add(new_account);//Set the New Account JPanel into the container.
        container.pack();//Make sure the container is sized correctly.
        container.repaint();//Make sure all the elements in the container show correctly.
        new_account.setVisible(true);//Set the New Account JPanel to visible.
    }
    
}
