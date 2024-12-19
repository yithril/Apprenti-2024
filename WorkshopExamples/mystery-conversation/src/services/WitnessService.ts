import { QuestionNode } from "../models/QuestionNode";


export class WitnessService {
  static getCountessData(): Promise<QuestionNode> {
    const mockTree: QuestionNode = {
      question: "Darling, what can I help you with?",
      answers: [
        {
          response: "Where were you last night?",
          nextNode: {
            question: "I was enjoying the moonlight with my husband. Why do you ask?",
            answers: [
              {
                response: "Did anyone see you?",
                nextNode: {
                  question: "The villa staff might have noticed us. But I was with my dear husband the entire time.",
                  answers: [
                    {
                      response: "Did you see Magnus Rocketfeller?",
                      nextNode: {
                        question: "Ah, Magnus. Such a tragic end. But no, I did not see him after tea.",
                        answers: [
                          { response: "What tea?", nextNode: null },
                          {
                            response: "What was the tea like?",
                            nextNode: {
                              question: "It was his favorite—a rare blend of Siberian Nightshade. Such an... acquired taste.",
                              answers: [
                                { response: "Did you drink it too?", nextNode: null },
                                {
                                  response: "Was the tea poisoned?",
                                  nextNode: {
                                    question: "Oh, darling, how dramatic! But if it was, surely it was not my doing.",
                                    answers: [
                                      { response: "Are you sure?", nextNode: null },
                                      {
                                        response: "Who else could have done it?",
                                        nextNode: {
                                          question: "Perhaps his secretary. She was always fluttering about, so concerned with his affairs.",
                                          answers: [
                                            { response: "Did you get along with her?", nextNode: null },
                                            { response: "What did you think of her?", nextNode: null },
                                          ],
                                        },
                                      },
                                    ],
                                  },
                                },
                              ],
                            },
                          },
                        ],
                      },
                    },
                  ],
                },
              },
              {
                response: "What were you doing specifically?",
                nextNode: {
                  question: "We danced, drank wine, and listened to the waves. Such romance!",
                  answers: [
                    {
                      response: "What kind of wine?",
                      nextNode: {
                        question: "A delightful Château Margaux, 1928. Quite fitting for the occasion.",
                        answers: [
                          { response: "What occasion?", nextNode: null },
                          {
                            response: "Did Magnus have any?",
                            nextNode: {
                              question: "Oh, I believe he abstained. Pity, really.",
                              answers: [
                                { response: "Why?", nextNode: null },
                                {
                                  response: "Did he seem ill?",
                                  nextNode: {
                                    question: "He did look pale at tea, but I assumed it was just the stress of his empire crumbling.",
                                    answers: [
                                      { response: "What do you mean?", nextNode: null },
                                      { response: "Was he sick?", nextNode: null },
                                    ],
                                  },
                                },
                              ],
                            },
                          },
                        ],
                      },
                    },
                    { response: "Did anyone else join you?", nextNode: null },
                  ],
                },
              },
            ],
          },
        },
        {
          response: "Did you know the victim?",
          nextNode: {
            question: "Ah, Magnus Rocketfeller. Such a powerful man, yet so fragile at heart.",
            answers: [
              {
                response: "What do you mean fragile?",
                nextNode: {
                  question: "Oh, he was plagued by worries—his fortune, his health, his rivals. Always fretting.",
                  answers: [
                    {
                      response: "Did you argue with him?",
                      nextNode: {
                        question: "Goodness, no! Our conversations were always polite, if... pointed.",
                        answers: [
                          { response: "Pointed how?", nextNode: null },
                          {
                            response: "Did he upset you?",
                            nextNode: {
                              question: "He did question my wine tastes once. Can you imagine?",
                              answers: [
                                { response: "Was he joking?", nextNode: null },
                                {
                                  response: "Were you offended?",
                                  nextNode: {
                                    question: "Darling, I am always the picture of composure.",
                                    answers: [
                                      { response: "Even now?", nextNode: null },
                                      { response: "Really?", nextNode: null },
                                    ],
                                  },
                                },
                              ],
                            },
                          },
                        ],
                      },
                    },
                    { response: "Was he worried about anyone specific?", nextNode: null },
                  ],
                },
              },
              {
                response: "Did he seem worried about anything?",
                nextNode: {
                  question: "He did mention some business deal going sour. Something about steel imports.",
                  answers: [
                    { response: "Who was involved?", nextNode: null },
                    { response: "Did you care about his business?", nextNode: null },
                  ],
                },
              },
            ],
          },
        },
      ],
    };

    return new Promise((resolve) => {
      setTimeout(() => resolve(mockTree), 500); // Simulate a delay
    });
  }
}
