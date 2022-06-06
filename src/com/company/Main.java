package com.company;

import com.company.stuff.BaseVehicle;
import com.company.stuff.TallVehicle;
import com.company.stuff.Thing;
import com.company.stuff.engines.*;
import com.company.stuff.interfaces.Air;
import com.company.stuff.interfaces.Ground;
import com.company.stuff.interfaces.Water;
import com.company.things.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static com.company.stuff.Color.*;

public class Main {

    public static void main(String[] args) {
        //ZAD2
        Sedan sedan1 = new Sedan(RED, "typical sedan", new CombustionEngine(40, 80), 1000);
        Sedan sedan2 = new Sedan(RED, "typical sedan 2", new CombustionEngine(40, 80), 1000);

        Bus bus1 = new Bus(BLUE, "Ogorek", new CombustionEngine(60, 80), 3000);
        Bus bus2 = new Bus(RED, "Gunwo z ZTM", new CombustionEngine(60, 80), 300000);

        Tram tram1 = new Tram(GREEN, "Gunwo z ZTM", new ElectricEngine(100), 7000);
        Tram tram2 = new Tram(GREEN, "Gunwo z ZTM 2", new ElectricEngine(100), 7000);

        DeliveryVan deliveryVan1 = new DeliveryVan(RED, "Telepizzaapplication", new CombustionEngine(60, 80), 4000);
        DeliveryVan deliveryVan2 = new DeliveryVan(RED, "Telepizzaapplication2", new CombustionEngine(60, 80), 6000);

        FloatPlane floatPlane1 = new FloatPlane(GREEN, "hydroplan", new CombustionEngine(400, 80), 2000, 2000);
        FloatPlane floatPlane2 = new FloatPlane(GREEN, "hydroplan2", new CombustionEngine(500, 80), 3100, 7000);

        JetFighter jetFighter1 = new JetFighter(BLUE, "ratatatata", new CombustionEngine(500, 80), 10000, 10000);
        JetFighter jetFighter2 = new JetFighter(BLUE, "ratatatatata", new CombustionEngine(500, 80), 10000, 50000);

        Bulldozer bulldozer1 = new Bulldozer(RED, "bldzr", new CombustionEngine(300, 80), 11000);
        Bulldozer bulldozer2 = new Bulldozer(GREEN, "bldzr22222", new CombustionEngine(300, 80), 10000);

        Motorbike motorbike1 = new Motorbike(RED, "moto", new CombustionEngine(10, 80), 200);
        Motorbike motorbike2 = new Motorbike(BLUE, "motomoto", new CombustionEngine(10, 80), 200);

        Bicycle bicycle1 = new Bicycle(RED, "1", new Legs(10000), 100);
        Bicycle bicycle2 = new Bicycle(RED, "2", new Legs(10000), 100);

        Helicotper helicopter1 = new Helicotper(GREEN, "HELIKOPTER", new CombustionEngine(400, 80), 1000, 30000);
        Helicotper helicopter2 = new Helicotper(GREEN, "HELIKOPTER2", new CombustionEngine(400, 80), 1000, 30000);

        CarAmphibious carAmphibious1 = new CarAmphibious(GREEN, "swimming boi 1", new CombustionEngine(50, 80), 1000);
        CarAmphibious carAmphibious2 = new CarAmphibious(GREEN, "swimming boi 2", new CombustionEngine(50, 80), 1000);

        CombustionEngine combustionEngine1 = new CombustionEngine(200, 80);
        ElectricEngine electricEngine1 = new ElectricEngine(100);
        Legs legs1 = new Legs(10000);

        CombustionEngine combustionEngine2 = new CombustionEngine(200, 80);
        ElectricEngine electricEngine2 = new ElectricEngine(100);
        Legs legs2 = new Legs(10000);

        //ZAD3

        Thing[] tab1 = {sedan1,sedan2,bus1,bus2,tram1,tram2,deliveryVan1,deliveryVan2,floatPlane1,floatPlane2,jetFighter1,jetFighter2,bulldozer1,bulldozer2,motorbike1,motorbike2,bicycle1,bicycle2,helicopter1,helicopter2,carAmphibious1,carAmphibious2,combustionEngine1,combustionEngine2,legs1,legs2,electricEngine1,electricEngine2};
        BaseVehicle[] tab2 = {sedan1,sedan2,bus1,bus2,tram1,tram2,deliveryVan1,deliveryVan2,floatPlane1,floatPlane2,jetFighter1,jetFighter2,bulldozer1,bulldozer2,motorbike1,motorbike2,bicycle1,bicycle2,helicopter1,helicopter2,carAmphibious1,carAmphibious2};
        Ground[] tab3 = {sedan1,sedan2,bus1,bus2,tram1,tram2,deliveryVan1,deliveryVan2,jetFighter1,jetFighter2,bulldozer1,bulldozer2,motorbike1,motorbike2,bicycle1,bicycle2,carAmphibious1,carAmphibious2};
        Air[] tab4 = {floatPlane1,floatPlane2,jetFighter1,jetFighter2,helicopter1,helicopter2};
        Water[] tab5 = {floatPlane1,floatPlane2,carAmphibious1,carAmphibious2};
        BaseVehicle[] tab6 = {sedan1,sedan2,bus1,bus2,deliveryVan1,deliveryVan2,floatPlane1,floatPlane2,jetFighter1,jetFighter2,bulldozer1,bulldozer2,motorbike1,motorbike2,helicopter1,helicopter2,carAmphibious1,carAmphibious2};
        Bulldozer[] tab7 = {bulldozer1,bulldozer2};

        //ZAD4

        for(Thing t : tab1){
            t.buy("2499 dollurs");
            t.printPatentsClassName();
            if(BaseVehicle.class.isAssignableFrom(t.getClass())){
                ((BaseVehicle) t).printVehicleName();
            }
            else{
                System.out.println("This isn't a vehicle!");
            }
            t.sell("5000 vbucks");
        }

        for(BaseVehicle b : tab2){
            b.buy("1000 koron");
            if(ActualEngine.class.isAssignableFrom(b.getEngine().getClass())){
                ((ActualEngine) b.getEngine()).start();
            }
            else{
                System.out.println("Engine cannot be started!");
            }
        }

        for(Ground g : tab3){
            ((BaseVehicle) g).buy("??? ??");
            g.drive();
        }

        //ZAD5
        int i;

        i = 0;
        while(i<tab4.length){
            ((BaseVehicle) tab4[i]).buy("<insert price>");
            tab4[i].fly(400,300);
            tab4[i].land();
            i++;
        }

        i = 0;
        while(i<tab5.length){
            ((BaseVehicle) tab5[i]).buy("<insert price>");
            tab5[i].swim();
            i++;
        }

        i = 0;
        while(i<tab6.length){
            tab6[i].buy("<insert price>");
            ((CombustionEngine) tab6[i].getEngine()).tank(200);
            i++;
        }

        i = 0;
        while(i<tab7.length){
            tab7[i].buy("<insert price>");
            tab7[i].work();
            i++;
        }
    }
}
