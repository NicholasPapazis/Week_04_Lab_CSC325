package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive("Moaath Alrajab", "25 New Tree Line", "516-101-3131", "000-000-1234", 50.0);
        staffList[1] = new Executive("John", "35 New Tree Line", "516-454-5831", "000-000-7514", 40.0);
        staffList[2] = new TempEmploee("William", "85 Old Tree Line", "516-753-3758", "000-000-1474", 70.0);
        staffList[3] = new TempEmploee("Sam", "15 New Rare Line", "516-145-7428", "000-000-2557", 30.0);
        staffList[4] = new Executive("Alex", "55 New Smart Line", "516-783-143", "000-000-4725", 55.0);
        staffList[5] = new TempEmploee("Ahmed", "75 New Fresh Line", "516-821-7682", "000-000-3671", 35.0);


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);

        ((Executive)staffList[1]).awardBonus(500.00);

        ((TempEmploee)staffList[2]).addHours(40);

        ((Executive)staffList[4]).awardBonus(500.00);

        ((TempEmploee)staffList[5]).addHours(40);


    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}