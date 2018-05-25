package top.ynan.runner.api.controller;

import top.ynan.runner.api.utils.ResultGenerator;
import top.ynan.runner.api.vo.Result;
import top.ynan.runner.core.domain.Example;
import top.ynan.runner.core.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    //http://localhost:8088/api/example/save?title=aa&remark=bb
    @PostMapping("/save")
    public Result save(@RequestParam String title, @RequestParam String remark){
        Example example = new Example();
        example.setTitle(title);
        example.setRemark(remark);
        Example result = exampleService.save(example);
        return ResultGenerator.ok(result);
    }

    //http://localhost:8088/api/example/{id}
    @GetMapping("/{id}")
    public Result get(@PathVariable Long id){
        Example example = exampleService.findById(id);
        return ResultGenerator.ok(example);
    }
}
