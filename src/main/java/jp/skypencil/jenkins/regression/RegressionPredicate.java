package jp.skypencil.jenkins.regression;

import hudson.tasks.junit.CaseResult;

import com.google.common.base.Predicate;

class RegressionPredicate implements Predicate<CaseResult> {
    @Override
    public boolean apply(CaseResult input) {
        return input.getStatus().isRegression();
    }
}
