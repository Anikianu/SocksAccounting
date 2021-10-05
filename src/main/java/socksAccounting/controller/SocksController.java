package socksAccounting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import socksAccounting.Socks;
import socksAccounting.service.InputOutputShow;

import java.util.List;

@RestController
@RequestMapping
public class SocksController {
    private final InputOutputShow inputOutputShow;

    public SocksController(InputOutputShow inputOutputShow) {
        this.inputOutputShow = inputOutputShow;
    }


    @GetMapping(path = "api/socks")
    public List<Socks> getSocks(@RequestParam(name = "color") String color,
                                @RequestParam(name = "operation") String operation,
                                @RequestParam(name = "cottonPart") int cottonPart) {
        return inputOutputShow.getSocks(color, operation, cottonPart);
    }

}
