package dev.gocas.musclab

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.gocas.musclab.ui.navigation.AppNavHost
import org.junit.Rule
import org.junit.Test

class NavigationTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun appNavHost_startsAtHomePageAndNavigatesToProfile() {
        // Start the AppNavHost
        composeTestRule.setContent {
            AppNavHost()
        }

        // Verify that we are on the Home page initially
        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
        composeTestRule.onNodeWithText("Profile page").assertIsDisplayed()

        // Click the "Profile page" button
        composeTestRule.onNodeWithText("Profile page").performClick()

        // Verify that we have navigated to the Profile page
        composeTestRule.onNodeWithText("User").assertIsDisplayed()
        composeTestRule.onNodeWithText("Back to Home").assertIsDisplayed()

        // Click the "Back to Home" button
        composeTestRule.onNodeWithText("Back to Home").performClick()

        // Verify that we have navigated back to the Home page
        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
        composeTestRule.onNodeWithText("Profile page").assertIsDisplayed()
    }
}