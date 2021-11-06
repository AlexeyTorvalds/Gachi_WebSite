package org.gachi.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.gachi.dataBase.DataBaseDungeon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class Master {
    @Autowired
    private DataBaseDungeon dataBaseDungeon;

    @GetMapping("/api/master")
    public void getBill (HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        InputStream in = getClass().getClassLoader().getResourceAsStream(dataBaseDungeon.getMaster().getPathToImage());
        IOUtils.copy(in, response.getOutputStream());
    }
}
