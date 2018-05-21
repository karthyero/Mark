Feature: CreateLead to TestLeaf

Scenario Outline: CreateLead to TestLeaf(positive)
And Type Username as <username>
And Type password as <pwd>
And Click Login button
And Click crmsfa link
And Click leads link
And Click create lead link
And enter the company name as <cname>
And enter the firstname as <fname>
And enter the lastname as <lname>
When click lead link
Then enter the verify firstname as <fname>

Examples:
|username|pwd|cname|fname|lname|
|demosalesmanager|crmsfa|TCS|Nagoor|Ameer|
|demosalesmanager|crmsfa|TL|Karthi|Karthikeyan|
