export interface QuestionNode {
    question: string;
    answers: { 
      response: string; 
      nextNode?: QuestionNode | null; 
    }[];
}