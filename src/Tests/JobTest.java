package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Job;

import javax.lang.model.element.Name;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        assertEquals(job_test.getId(),job_testTwo.getId(), 1);

    }
}
