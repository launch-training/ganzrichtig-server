package com.accenture.ganzrichtig.stable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StableController {

    @Autowired
    private StableRepository stableRepository;

    @GetMapping("/stables")
    public Iterable<Stable> readAllStables() {
        return stableRepository.findAll();
    }

    @GetMapping("/stables/{stableId}")
    public Stable readOneStable(@PathVariable("stableId") Long stableId) {
        return stableRepository.findById(stableId).get();
    }
  // 10:00
}
