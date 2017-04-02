package org.strumento;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Pawel_D on 2017-02-18.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "classpath:org.strumento",
        plugin = {"html:target/selenium-report", "rerun:target/rerun.txt"},
//        name = {"PIN"},
        tags = {
//                "@sanity",
//                "@regression",
//                "@Onet",
//                "@Onet1",
//                "@Onet2",
//                "@Softpost1",
//                "@Selenium",
//                "@correctPIN",
//                "@inCorrectPIN",
//                "@PIN",
//                "@Datatable",
//                "@titleWebsiteUser",
//                "@titleWebsite",
//                "@outlineData",
//                "@outlineExample",
//                "@parameters",
//                "@parameterSoftpost"
//                "@parameterGoogle",
//                "@Posts",
//                "@NewPost",
//                "@NewComment"
        }
)
public class RunTests {
}