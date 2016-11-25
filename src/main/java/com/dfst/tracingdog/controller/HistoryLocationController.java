package com.dfst.tracingdog.controller;

import com.dfst.tracingdog.pojo.HistoryLocation;
import com.dfst.tracingdog.service.HistoryLocationService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yanfei on 2016-11-17.
 */

@Controller
@EnableAutoConfiguration
@RequestMapping("/test")
public class HistoryLocationController {

    @Resource(name="HistoryLocationService")
    private HistoryLocationService historyLocationService;

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    @ResponseBody
    public HistoryLocation get(@PathVariable("id") Long id, @RequestParam("userid") Integer userid) {
        HistoryLocation location = historyLocationService.findOne(id);
        location.setUserId(userid);
        return location;
    }

    @RequestMapping(value="/longitude/{longitude}/latitude/{latitude}/userid/{userid}", method = RequestMethod.POST)
    @ResponseBody
    public String add(@PathVariable("longitude") Double longitude, @PathVariable("latitude") Double latitude,
                      @PathVariable("userid") Integer userid) {
        HistoryLocation location = new HistoryLocation();
        location.setLongitude(longitude);
        location.setLatitude(latitude);
        location.setUserId(userid);
        location.setTime(new Date());
        historyLocationService.add(location);
        return "success";
    }

    @RequestMapping(value="/test", method = RequestMethod.POST)
    @ResponseBody
    public String test() {
        return "asdfasdf";
    }
}
