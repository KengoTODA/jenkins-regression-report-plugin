package jp.skypencil.jenkins.regression;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import hudson.model.Descriptor.FormException;
import hudson.model.FreeStyleProject;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;
import org.jvnet.hudson.test.HudsonTestCase;
import org.xml.sax.SAXException;

import com.gargoylesoftware.htmlunit.html.HtmlButton;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class RegressionReportConfigTest extends HudsonTestCase {

    private static final String NAME_CHECKBOX = "jp-skypencil-jenkins-regression-RegressionReportNotifier";
    private static final String JOB_NAME = "Test";

    @Test
    @Ignore
    public void testEnabledIsTrue() throws FormException, IOException,
            SAXException {
        testEnabled(true);
    }

    @Test
    @Ignore
    public void testEnabledIsFalse() throws FormException, IOException,
            SAXException {
        testEnabled(false);
    }

    private void testEnabled(boolean isEnabled) throws FormException,
            IOException, SAXException {
        FreeStyleProject project = createFreeStyleProject(JOB_NAME);

        try {
            HtmlPage configPage = new WebClient().goTo("job/" + JOB_NAME
                    + "/configure");
            HtmlForm form = configPage.getFormByName("config");
            form.getInputByName(NAME_CHECKBOX).setChecked(isEnabled);
            form.submit((HtmlButton) last(form
                    .getHtmlElementsByTagName("button")));

            configPage = new WebClient().goTo("job/" + JOB_NAME + "/configure");
            form = configPage.getFormByName("config");
            HtmlInput checkbox = form.getInputByName(NAME_CHECKBOX);
            assertThat(checkbox.isChecked(), is(isEnabled));
        } finally {
            try {
                project.delete();
            } catch (InterruptedException ignore) {
                ignore.printStackTrace();
            }
        }
    }
}
