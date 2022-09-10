package com.company.design;

import com.company.design.adapter.*;
import com.company.design.decorator.Audi;
import com.company.design.decorator.ICar;
import com.company.design.singleton.Aclazz;
import com.company.design.singleton.Bclazz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        /*
        Aclazz aClazz = new Aclazz();
        Bclazz bClazz = new Bclazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
        */

        /*
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        //        connect(cleaner);
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);


        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
        */

       ICar audi = new Audi(1000);
       audi.showPrice();

       // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();
       //a4
        ICar audi4 = new A4(audi, "A4");




   }

    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
