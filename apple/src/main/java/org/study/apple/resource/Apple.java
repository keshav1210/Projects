package org.study.apple.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.apple.model.Device;
import org.study.apple.model.Devices;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {
    @RequestMapping("/devices")
    public Devices getDevices(){

        List<Device> devices=new ArrayList<>();
        devices.add(new Device("I pad 9","smartphone"));
        devices.add(new Device("I phone 5","smartphone"));
        Devices devicesList=new Devices(devices);
        return devicesList;
    }
}