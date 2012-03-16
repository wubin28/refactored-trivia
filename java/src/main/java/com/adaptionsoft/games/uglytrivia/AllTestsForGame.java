package com.adaptionsoft.games.uglytrivia;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestGameInitialization.class,
	TestGameAdd.class,
	TestsForRoll.class,
	TestsForInternalRollWhenNotInPenaltyBox.class,
	TestGameCurrentCategory.class,
	TestGameAskQuestion.class,
	TestGameInternalRollWhenInPenaltyBox.class
})
public class AllTestsForGame {

}