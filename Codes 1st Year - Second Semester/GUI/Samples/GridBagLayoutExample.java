    import java.awt.Button;  
    import java.awt.GridBagConstraints;  
    import java.awt.GridBagLayout;  
      
    import javax.swing.*;  
    public class GridBagLayoutExample extends JFrame{  
        public static void main(String[] args) {  
                GridBagLayoutExample a = new GridBagLayoutExample();  
            }  

            public GridBagLayoutExample() {  
        GridBagLayout grid = new GridBagLayout();  
                GridBagConstraints gbc = new GridBagConstraints();  
                setLayout(grid);  
                setTitle("GridBag Layout Example");  
                GridBagLayout layout = new GridBagLayout();  
        this.setLayout(layout);  
    
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.gridwidth = 2;  
        this.add(new Button("1"), gbc);  
                setSize(300, 300);  
                setPreferredSize(getSize());  
                setVisible(true);  
                setDefaultCloseOperation(EXIT_ON_CLOSE);  
          
            }  
          
    }  