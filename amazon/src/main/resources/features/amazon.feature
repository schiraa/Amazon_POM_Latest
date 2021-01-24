@Demo
Feature: Validate Amazon E2E Scenarios

  Background: 
    Given User launch Amazon UK site
    

  Scenario Outline: User Search the books from Amazon store
    And User Select "<Books>" from search dropdown
    Then User search book "<BookName>"
    And Validate the Search Result

    Examples: 
      | BookName                                 | Books |
      | Harry Potter and the Philosopher's Stone | Books |

  Scenario Outline: User Check Whether the Booke is Best selling in Amazon UK site
    And User Select "<Books>" from search dropdown
    Then User search book "<BookName>"
    And User Check whether the Book is "Best Seller" or Not

    Examples: 
      | BookName                                 | Books |
      | Harry Potter and the Philosopher's Stone | Books |

  Scenario Outline: User Verify the author,Book related information form Search Page
    And User Select "<Books>" from search dropdown
    Then User search book "<BookName>"
    And User check the BookName,Authore and Other information

    Examples: 
      | BookName                                 | Books |
      | Harry Potter and the Philosopher's Stone | Books |

  Scenario Outline: User Verify the Book is available in Kindle format
    And User Select "<Books>" from search dropdown
    Then User search book "<BookName>"
    And User check the Book is available in "Kindle" format

    Examples: 
      | BookName                                 | Books |
      | Harry Potter and the Philosopher's Stone | Books |

  Scenario Outline: User Verify the author,Book related information form Search Page
    And User Select "<Books>" from search dropdown
    Then User search book "<BookName>"
    And User select the Book nd Proceeds towards checkout
    And If User dnot have Account,validate all fields on Craete Amazon account Page

    Examples: 
      | BookName                                 | Books |
      | Harry Potter and the Philosopher's Stone | Books |
