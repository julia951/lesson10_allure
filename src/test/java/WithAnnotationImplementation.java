import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WithAnnotationImplementation extends BaseTest {

    @Test
    @DisplayName("Test with annotation @Step usage")
    public void annotatedStepsTest() {
        WithAnnonation annotationSteps = new WithAnnonation();

        annotationSteps.openMainPage();
        annotationSteps.searchRepository(REPOSITORY);
        annotationSteps.openRepositoryLink(REPOSITORY);
        annotationSteps.openIssueTab();
        annotationSteps.checkIssueNumber(ISSUE_NUMBER);
    }
}