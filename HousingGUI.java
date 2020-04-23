 
/**
 * This class displays the GUI for the housing search application
 * 
 * @author michaelhoffmann johnconnolly sabrinatodd
 *
 */


public class HousingGUI extends javax.swing.JFrame {
     

	/**
	 * Creates new Housing GUI
	 */
    public HousingGUI() {
        initComponents();
    }
    
    /*
     * Establishes initial components of GUI 
     */
    private void initComponents() {
    
    	//First field - max home price
    	maxHomePrice = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        
        //Second - preferred # of bedrooms
        numberBedrooms = new javax.swing.JTextField();
        bedroomLabel = new javax.swing.JLabel();
               
        //Third - preferred avg daily temp 
        prefDailyTemp = new javax.swing.JTextField();
        tempLabel = new javax.swing.JLabel();
        
        //Fourth - preferred monthly precipitation (in) 
        prefMonthlyPrecip = new javax.swing.JTextField();
        precipLabel = new javax.swing.JLabel();
        
        //Fifth - max annual  below freezing 
        maxDaysBelowFreezing = new javax.swing.JTextField();
        freezingLabel = new javax.swing.JLabel();
        
        //Sixth - preferred town size (population)
        prefTownSize = new javax.swing.JTextField();
        townSizeLabel = new javax.swing.JLabel();
 
        //Seventh - preferred median age 
        prefMedianAge = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
         
        //Eighth - preferred average household size (number of people)
        prefHouseSize = new javax.swing.JTextField();
        houseSizeLabel = new javax.swing.JLabel();
           
        //Next Button
        nextButton = new javax.swing.JButton();
        
        //Results 
        listOfZipCodes = new javax.swing.JLabel();
 
        //Default ops
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("House Search Tool");
 
        //Labels
        priceLabel.setText("Maximum Home Price ($)");
        bedroomLabel.setText("Preferred Number of Bedroms (1-5)");
        tempLabel.setText("Preferred Average Daily Temperature");
        precipLabel.setText("Preferred Monthly Precipitation (in)");
        freezingLabel.setText("Maximum Annual Days Below Freezing");
        townSizeLabel.setText("Preferred Town Size (population)");
        ageLabel.setText("Preferred Median Age");
        houseSizeLabel.setText("Preferred Average Household Size");
        listOfZipCodes.setText("We will display your list of ZIP codes here.");

        // Next button action listener
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        
        //Determine page layouts
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maxHomePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel))
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(numberBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bedroomLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(prefDailyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tempLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(prefMonthlyPrecip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(precipLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(maxDaysBelowFreezing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(freezingLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(prefTownSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(townSizeLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(prefMedianAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ageLabel)) 
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(prefHouseSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(houseSizeLabel)) 
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listOfZipCodes)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
 
        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nextButton, maxHomePrice, numberBedrooms, prefDailyTemp, prefMonthlyPrecip, maxDaysBelowFreezing, prefTownSize, prefMedianAge, prefHouseSize});
 
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxHomePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bedroomLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prefDailyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tempLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prefMonthlyPrecip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(precipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maxDaysBelowFreezing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(freezingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prefTownSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(townSizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prefMedianAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prefHouseSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(houseSizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(listOfZipCodes))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
    }
 
    /**
     * Our housing application goes here. 
     * @param evt
     */
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int maxHomeValue = (int)(Double.parseDouble(maxHomePrice.getText()));
        int prefBedrooms = (int)(Double.parseDouble(numberBedrooms.getText()));
        int prefTemp = (int)(Double.parseDouble(prefDailyTemp.getText()));
        int prefPrecip = (int)(Double.parseDouble(prefMonthlyPrecip.getText()));
        int maxFreezing = (int)(Double.parseDouble(maxDaysBelowFreezing.getText()));
        int prefTown = (int)(Double.parseDouble(prefTownSize.getText()));
        int prefAge = (int)(Double.parseDouble(prefMedianAge.getText()));
        int prefHouse = (int)(Double.parseDouble(prefHouseSize.getText()));       
        
        
        UserInput ui = new UserInput(maxHomeValue, prefBedrooms,prefTemp, prefPrecip, maxFreezing, prefTown, prefAge, prefHouse); 
        
        int zipCodes = maxHomeValue + prefBedrooms + prefTemp + prefPrecip + maxFreezing + prefTown + prefAge + prefHouse;
        
        listOfZipCodes.setText("We recommend these ZIP codes: " + zipCodes);
    }
     
    
    /**
     * @param args 
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HousingGUI().setVisible(true);
            }
        });
    }
     
    // Variables declaration 
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel listOfZipCodes;
    
    private javax.swing.JTextField maxHomePrice;
    private javax.swing.JLabel priceLabel;

    private javax.swing.JTextField numberBedrooms;
    private javax.swing.JLabel bedroomLabel;

    private javax.swing.JTextField prefDailyTemp;
    private javax.swing.JLabel tempLabel;

    private javax.swing.JTextField prefMonthlyPrecip;
    private javax.swing.JLabel precipLabel;

    private javax.swing.JTextField maxDaysBelowFreezing;
    private javax.swing.JLabel freezingLabel;

    private javax.swing.JTextField prefTownSize;
    private javax.swing.JLabel townSizeLabel;
    
    private javax.swing.JTextField prefMedianAge;
    private javax.swing.JLabel ageLabel;

    private javax.swing.JTextField prefHouseSize;
    private javax.swing.JLabel houseSizeLabel;
    


     
     
}