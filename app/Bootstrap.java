import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Created by IntelliJ IDEA.
 * User: chad
 * Date: 11/28/11
 * Time: 10:35 PM
 * To change this template use File | Settings | File Templates.
 */

@OnApplicationStart
public class Bootstrap extends Job {
    public void doJob() {
        // Check if the database is empty
        if (User.count() == 0) {
            Fixtures.loadModels("initial-data.yml");
        }
    }
}
