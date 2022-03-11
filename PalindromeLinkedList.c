/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

//function to reverse a linked list
void reverseList(struct ListNode **head) {
    struct ListNode *prev = NULL;
    struct ListNode *current = *head;
    struct ListNode *next = NULL;
    
    while(current != NULL) {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    
    *head = prev;
        
}

//check whether a number is a palindrome. Each digit is stored as a node in singly-linked list

bool isPalindrome(struct ListNode* head){
    
    //find the mid point with tortoise and hare
    
    struct ListNode *tortoise = head;
    struct ListNode *hare = head;
    
    while(hare != NULL && hare->next != NULL) {
        tortoise = tortoise->next;
        hare = hare->next->next;
    }
    
    //reverse the list with tortoise as head (so basically the second half of the list only)
    reverseList(&tortoise);
    
    //initialize pointer to beginning of first half of list
    struct ListNode *current = head;
    
    //allow both current and tortoise to move one step at a time, comparing elements at each step. Eventually the elements will converge to the middle of the original, non-reversed list
    while(tortoise != NULL) {
        if(current->val != tortoise->val) {
            return false;
        }
        current = current->next;
        tortoise = tortoise->next;
    }
    
    return true;

}