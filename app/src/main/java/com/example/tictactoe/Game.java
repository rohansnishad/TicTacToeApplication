package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {
    boolean win = false;
    TextView one, two, three, four, five, six, seven, eight, nine;
    String player1Name, player2Name, player1Sign, player2Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent chance = getIntent();
        player1Name = chance.getStringExtra("player1Name");
        player1Sign = chance.getStringExtra("player1Sign");
        player2Name = chance.getStringExtra("player2Name");
        player2Sign = chance.getStringExtra("player2Sign");

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);



        firstTurn();
    }

    public void firstTurn() {
        Toast.makeText(Game.this, player1Name + " it's your turn", Toast.LENGTH_SHORT).show();
        one.setOnClickListener(d -> {
            if (one.getText().toString().equals("X")) {
                one.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(d -> {
            if (two.getText().toString().equals("X")) {
                two.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(d -> {
            if (three.getText().toString().equals("X")) {
                three.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });

        four.setOnClickListener(d -> {
            if (four.getText().toString().equals("X")) {
                four.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(d -> {
            if (five.getText().toString().equals("X")) {
                five.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(d -> {
            if (six.getText().toString().equals("X")) {
                six.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(d -> {
            if (seven.getText().toString().equals("X")) {
                seven.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(d -> {
            if (eight.getText().toString().equals("X")) {
                eight.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        nine.setOnClickListener(d -> {
            if (nine.getText().toString().equals("X")) {
                nine.setText(player1Sign);
                this.secondTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void secondTurn() {
        Toast.makeText(Game.this, player2Name + " it's your turn", Toast.LENGTH_SHORT).show();
        one.setOnClickListener(d -> {
            if (one.getText().toString().equals("X")) {
                one.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        two.setOnClickListener(d -> {
            if (two.getText().toString().equals("X")) {
                two.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        three.setOnClickListener(d -> {
            if (three.getText().toString().equals("X")) {
                three.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        four.setOnClickListener(d -> {
            if (four.getText().toString().equals("X")) {
                four.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        five.setOnClickListener(d -> {
            if (five.getText().toString().equals("X")) {
                five.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        six.setOnClickListener(d -> {
            if (six.getText().toString().equals("X")) {
                six.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        seven.setOnClickListener(d -> {
            if (seven.getText().toString().equals("X")) {
                seven.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        eight.setOnClickListener(d -> {
            if (eight.getText().toString().equals("X")) {
                eight.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        nine.setOnClickListener(d -> {
            if (nine.getText().toString().equals("X")) {
                nine.setText(player2Sign);
                this.thirdTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void thirdTurn() {
        Toast.makeText(Game.this, player1Name + " it's your turn", Toast.LENGTH_SHORT).show();
        one.setOnClickListener(d -> {
            if (one.getText().toString().equals("X")) {
                one.setText(player1Sign);

                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(d -> {
            if (two.getText().toString().equals("X")) {
                two.setText(player1Sign);

                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(d -> {
            if (three.getText().toString().equals("X")) {
                three.setText(player1Sign);

                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });

        four.setOnClickListener(d -> {
            if (four.getText().toString().equals("X")) {
                four.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(d -> {
            if (five.getText().toString().equals("X")) {
                five.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(d -> {
            if (six.getText().toString().equals("X")) {
                six.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(d -> {
            if (seven.getText().toString().equals("X")) {
                seven.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(d -> {
            if (eight.getText().toString().equals("X")) {
                eight.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        nine.setOnClickListener(d -> {
            if (nine.getText().toString().equals("X")) {
                nine.setText(player1Sign);
                this.fourthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void fourthTurn() {
        Toast.makeText(Game.this, player2Name + " it's your turn", Toast.LENGTH_SHORT).show();
        one.setOnClickListener(d -> {
            if (one.getText().toString().equals("X")) {
                one.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        two.setOnClickListener(d -> {
            if (two.getText().toString().equals("X")) {
                two.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        three.setOnClickListener(d -> {
            if (three.getText().toString().equals("X")) {
                three.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        four.setOnClickListener(d -> {
            if (four.getText().toString().equals("X")) {
                four.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        five.setOnClickListener(d -> {
            if (five.getText().toString().equals("X")) {
                five.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        six.setOnClickListener(d -> {
            if (six.getText().toString().equals("X")) {
                six.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        seven.setOnClickListener(d -> {
            if (seven.getText().toString().equals("X")) {
                seven.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        eight.setOnClickListener(d -> {
            if (eight.getText().toString().equals("X")) {
                eight.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        nine.setOnClickListener(d -> {
            if (nine.getText().toString().equals("X")) {
                nine.setText(player2Sign);
                this.fifthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void fifthTurn() {
        Toast.makeText(Game.this, player1Name + " it's your turn", Toast.LENGTH_SHORT).show();
        one.setOnClickListener(d -> {
            if (one.getText().toString().equals("X")) {
                one.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(d -> {
            if (two.getText().toString().equals("X")) {
                two.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(d -> {
            if (three.getText().toString().equals("X")) {
                three.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });

        four.setOnClickListener(d -> {
            if (four.getText().toString().equals("X")) {
                four.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(d -> {
            if (five.getText().toString().equals("X")) {
                five.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(d -> {
            if (six.getText().toString().equals("X")) {
                six.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(d -> {
            if (seven.getText().toString().equals("X")) {
                seven.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(d -> {
            if (eight.getText().toString().equals("X")) {
                eight.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }

        });
        nine.setOnClickListener(d -> {
            if (nine.getText().toString().equals("X")) {
                nine.setText(player1Sign);
                this.sixthTurn();
            } else {
                Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void sixthTurn() {
        if((one.getText().toString().equals(player1Sign) && two.getText().toString().equals(player1Sign)&& three.getText().toString().equals(player1Sign))
                ||
                (one.getText().toString().equals(player1Sign) && four.getText().toString().equals(player1Sign)&& seven.getText().toString().equals(player1Sign))
                ||
                (two.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& eight.getText().toString().equals(player1Sign))
                ||
                (three.getText().toString().equals(player1Sign) && six.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (four.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& six.getText().toString().equals(player1Sign))
                ||
                (seven.getText().toString().equals(player1Sign) && eight.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (one.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (three.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& seven.getText().toString().equals(player1Sign)))
        {
      this.winner(player1Name);
        }
        else {
            Toast.makeText(Game.this, player2Name + " it's your turn", Toast.LENGTH_SHORT).show();
            one.setOnClickListener(d -> {
                if (one.getText().toString().equals("X")) {
                    one.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            two.setOnClickListener(d -> {
                if (two.getText().toString().equals("X")) {
                    two.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            three.setOnClickListener(d -> {
                if (three.getText().toString().equals("X")) {
                    three.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            four.setOnClickListener(d -> {
                if (four.getText().toString().equals("X")) {
                    four.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            five.setOnClickListener(d -> {
                if (five.getText().toString().equals("X")) {
                    five.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            six.setOnClickListener(d -> {
                if (six.getText().toString().equals("X")) {
                    six.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            seven.setOnClickListener(d -> {
                if (seven.getText().toString().equals("X")) {
                    seven.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            eight.setOnClickListener(d -> {
                if (eight.getText().toString().equals("X")) {
                    eight.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            nine.setOnClickListener(d -> {
                if (nine.getText().toString().equals("X")) {
                    nine.setText(player2Sign);
                    this.seventhTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
        }
    }
    public void seventhTurn(){
        if((one.getText().toString().equals(player2Sign) && two.getText().toString().equals(player2Sign)&& three.getText().toString().equals(player2Sign))
                ||
                (one.getText().toString().equals(player2Sign) && four.getText().toString().equals(player2Sign)&& seven.getText().toString().equals(player2Sign))
                ||
                (two.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& eight.getText().toString().equals(player2Sign))
                ||
                (three.getText().toString().equals(player2Sign) && six.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (four.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& six.getText().toString().equals(player2Sign))
                ||
                (seven.getText().toString().equals(player2Sign) && eight.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (one.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (three.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& seven.getText().toString().equals(player2Sign)))
        {
    this.winner(player2Name);
        }

        else {
            Toast.makeText(Game.this, player1Name + " it's your turn", Toast.LENGTH_SHORT).show();
            one.setOnClickListener(d -> {
                if (one.getText().toString().equals("X")) {
                    one.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            two.setOnClickListener(d -> {
                if (two.getText().toString().equals("X")) {
                    two.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            three.setOnClickListener(d -> {
                if (three.getText().toString().equals("X")) {
                    three.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });

            four.setOnClickListener(d -> {
                if (four.getText().toString().equals("X")) {
                    four.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            five.setOnClickListener(d -> {
                if (five.getText().toString().equals("X")) {
                    five.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            six.setOnClickListener(d -> {
                if (six.getText().toString().equals("X")) {
                    six.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            seven.setOnClickListener(d -> {
                if (seven.getText().toString().equals("X")) {
                    seven.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            eight.setOnClickListener(d -> {
                if (eight.getText().toString().equals("X")) {
                    eight.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            nine.setOnClickListener(d -> {
                if (nine.getText().toString().equals("X")) {
                    nine.setText(player1Sign);
                    this.eightTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void eightTurn() {
        if((one.getText().toString().equals(player1Sign) && two.getText().toString().equals(player1Sign)&& three.getText().toString().equals(player1Sign))
                ||
                (one.getText().toString().equals(player1Sign) && four.getText().toString().equals(player1Sign)&& seven.getText().toString().equals(player1Sign))
                ||
                (two.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& eight.getText().toString().equals(player1Sign))
                ||
                (three.getText().toString().equals(player1Sign) && six.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (four.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& six.getText().toString().equals(player1Sign))
                ||
                (seven.getText().toString().equals(player1Sign) && eight.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (one.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& nine.getText().toString().equals(player1Sign))
                ||
                (three.getText().toString().equals(player1Sign) && five.getText().toString().equals(player1Sign)&& seven.getText().toString().equals(player1Sign)))
        {
            this.winner(player1Name);
        }
       else{
            Toast.makeText(Game.this, player2Name + " it's your turn", Toast.LENGTH_SHORT).show();
            one.setOnClickListener(d -> {
                if (one.getText().toString().equals("X")) {
                    one.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            two.setOnClickListener(d -> {
                if (two.getText().toString().equals("X")) {
                    two.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            three.setOnClickListener(d -> {
                if (three.getText().toString().equals("X")) {
                    three.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            four.setOnClickListener(d -> {
                if (four.getText().toString().equals("X")) {
                    four.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            five.setOnClickListener(d -> {
                if (five.getText().toString().equals("X")) {
                    five.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            six.setOnClickListener(d -> {
                if (six.getText().toString().equals("X")) {
                    six.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            seven.setOnClickListener(d -> {
                if (seven.getText().toString().equals("X")) {
                    seven.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            eight.setOnClickListener(d -> {
                if (eight.getText().toString().equals("X")) {
                    eight.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            nine.setOnClickListener(d -> {
                if (nine.getText().toString().equals("X")) {
                    nine.setText(player2Sign);
                    ninthTurn();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
        }
    }

    public void ninthTurn() {
        if((one.getText().toString().equals(player2Sign) && two.getText().toString().equals(player2Sign)&& three.getText().toString().equals(player2Sign))
                ||
                (one.getText().toString().equals(player2Sign) && four.getText().toString().equals(player2Sign)&& seven.getText().toString().equals(player2Sign))
                ||
                (two.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& eight.getText().toString().equals(player2Sign))
                ||
                (three.getText().toString().equals(player2Sign) && six.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (four.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& six.getText().toString().equals(player2Sign))
                ||
                (seven.getText().toString().equals(player2Sign) && eight.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (one.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& nine.getText().toString().equals(player2Sign))
                ||
                (three.getText().toString().equals(player2Sign) && five.getText().toString().equals(player2Sign)&& seven.getText().toString().equals(player2Sign)))
        {
            this.winner(player2Name);
        }
        else{
            Toast.makeText(Game.this, player1Name + " it's your turn ", Toast.LENGTH_SHORT).show();
            one.setOnClickListener(d -> {
                if (one.getText().toString().equals("X")) {
                    one.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            two.setOnClickListener(d -> {
                if (two.getText().toString().equals("X")) {
                    two.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            three.setOnClickListener(d -> {
                if (three.getText().toString().equals("X")) {
                    three.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });

            four.setOnClickListener(d -> {
                if (four.getText().toString().equals("X")) {
                    four.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            five.setOnClickListener(d -> {
                if (five.getText().toString().equals("X")) {
                    five.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            six.setOnClickListener(d -> {
                if (six.getText().toString().equals("X")) {
                    six.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            seven.setOnClickListener(d -> {
                if (seven.getText().toString().equals("X")) {
                    seven.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
            eight.setOnClickListener(d -> {
                if (eight.getText().toString().equals("X")) {
                    eight.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }

            });
            nine.setOnClickListener(d -> {
                if (nine.getText().toString().equals("X")) {
                    nine.setText(player1Sign);
                    notWinner();
                } else {
                    Toast.makeText(Game.this, "Please Choose another location", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public void winner(String name){
        Toast.makeText(Game.this,name+" your Winner Congratulations!",Toast.LENGTH_LONG).show();
        Intent in = new Intent(Game.this, MainActivity.class);
        startActivity(in);

    }
    public void notWinner() {
        Toast.makeText(Game.this, "match Draw", Toast.LENGTH_LONG).show();
        Intent in = new Intent(Game.this, MainActivity.class);
        startActivity(in);

    }
}