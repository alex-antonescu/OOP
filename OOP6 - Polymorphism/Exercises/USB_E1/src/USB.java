public class USB{
        public void transferPCToDevice(PC pc, Device device) {
            String data;
            data = pc.load();
            device.store(data);
            establishConnection(device);
            System.out.print(data);


//            if (device instanceof PhotoDevice)
//                System.out.println("PC -> PhotoDevice " + data);
//            else if (device instanceof VideoDevice)
//                System.out.println("PC -> VideoDevice " + data);
        }

        public void establishConnection(Device device){
            device.showConnection();
        }
        
    }