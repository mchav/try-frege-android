/*
  Source code is in UTF-8 encoding. The following symbols may appear, among others:
  α β γ δ ε ζ η θ ι κ λ μ ν ξ ο π ρ ς σ τ υ φ χ ψ ω « • ¦ » ∀ ∃ ∷ … → ← ﬁ ﬂ ƒ
  If you can't read this, you're out of luck. This code was generated with the frege compiler version 3.24.100
  from src/main/frege/io/github/mchav/tryfrege/ConsoleFragment.fr Do not edit this file!
  Instead, edit the source file and recompile.
*/

package io.github.mchav.tryfrege;

import frege.run7.Func;
import frege.run7.Lazy;
import frege.run7.Thunk;
import frege.run.Kind;
import frege.run.RunTM;
import frege.runtime.Meta;
import frege.runtime.Phantom.RealWorld;
import frege.Prelude;
import frege.control.Category;
import frege.control.Concurrent;
import frege.control.Semigroupoid;
import frege.java.IO;
import frege.java.Lang;
import frege.java.Util;
import frege.java.util.Regex;
import frege.prelude.Maybe;
import frege.prelude.PreludeArrays;
import frege.prelude.PreludeBase;
import frege.prelude.PreludeIO;
import frege.prelude.PreludeList;
import frege.prelude.PreludeMonad;
import frege.prelude.PreludeText;
import froid.Types;
import froid.content.Context;
import froid.content.Intent;
import froid.content.res.AssetManager;
import froid.content.res.Configuration;
import froid.graphics.Typeface;
import froid.os.Bundle;
import froid.support.v4.app.Fragment;
import froid.text.Editable;
import froid.text.TextWatcher;
import froid.util.Log;
import froid.view.ContextMenu;
import froid.view.LayoutInflater;
import froid.view.Menu;
import froid.view.MenuInflater;
import froid.view.MenuItem;
import froid.view.View;
import froid.view.ViewGroup;
import froid.view.animation.Animation;
import froid.widget.EditText;
import froid.widget.ScrollView;
import froid.widget.TextView;
import io.github.mchav.tryfrege.Net;
import io.github.mchav.tryfrege.Utilities;

@SuppressWarnings("unused")
@Meta.FregePackage(
  source="src\\main\\frege\\io\\github\\mchav\\tryfrege\\ConsoleFragment.fr", time=1539569107613L, jmajor=1,
  jminor=7,
  imps={
    "froid.os.Bundle", "frege.control.Concurrent", "froid.widget.EditText", "froid.support.v4.app.Fragment",
    "froid.view.LayoutInflater", "froid.util.Log", "io.github.mchav.tryfrege.Net", "frege.Prelude",
    "frege.prelude.PreludeArrays", "frege.prelude.PreludeBase", "frege.prelude.PreludeIO", "frege.prelude.PreludeList",
    "frege.prelude.PreludeMonad", "frege.prelude.PreludeText", "frege.java.util.Regex", "froid.widget.ScrollView",
    "froid.widget.TextView", "froid.graphics.Typeface", "io.github.mchav.tryfrege.Utilities", "froid.view.View",
    "froid.view.ViewGroup"
  },
  nmss={
    "Bundle", "Concurrent", "EditText", "Fragment", "LayoutInflater", "Log", "Net", "Prelude",
    "PreludeArrays", "PreludeBase", "PreludeIO", "PreludeList", "PreludeMonad", "PreludeText",
    "Regexp", "ScrollView", "TextView", "Typeface", "Utilities", "View", "ViewGroup"
  },
  symas={}, symcs={}, symis={}, symts={},
  symvs={
    @Meta.SymV(
      offset=1961, name=@Meta.QName(pack="io.github.mchav.tryfrege.ConsoleFragment", base="updateView"), stri="s(suuu)",
      sig=4, depth=4, rkind=49
    ),
    @Meta.SymV(
      offset=691, name=@Meta.QName(pack="io.github.mchav.tryfrege.ConsoleFragment", base="onCreateView"),
      stri="s(uussu)", sig=9, depth=5, rkind=49
    ),
    @Meta.SymV(
      offset=466, name=@Meta.QName(pack="io.github.mchav.tryfrege.ConsoleFragment", base="newConsoleFragment"),
      stri="s(u)", sig=10, depth=1, rkind=49
    ),
    @Meta.SymV(
      offset=1735, name=@Meta.QName(pack="io.github.mchav.tryfrege.ConsoleFragment", base="evaluateInput"),
      stri="s(uu)", sig=12, depth=2, rkind=49
    )
  },
  symls={},
  taus={
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.control.Concurrent", base="MVar")}),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="StringJ")}),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="Char")}),
    @Meta.Tau(kind=0, suba=1, subb=2), @Meta.Tau(kind=0, suba=0, subb=3),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeIO", base="Mutable")}),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="RealWorld")}),
    @Meta.Tau(kind=0, suba=5, subb=6),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.widget.EditText", base="EditText")}),
    @Meta.Tau(kind=0, suba=7, subb=8),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.widget.TextView", base="TextView")}),
    @Meta.Tau(kind=0, suba=7, subb=10),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.widget.ScrollView", base="ScrollView")}),
    @Meta.Tau(kind=0, suba=7, subb=12),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="ST")}),
    @Meta.Tau(kind=0, suba=14, subb=6),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="()")}),
    @Meta.Tau(kind=0, suba=15, subb=16),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.support.v4.app.Fragment", base="Fragment")}),
    @Meta.Tau(kind=0, suba=7, subb=18),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.view.LayoutInflater", base="LayoutInflater")}),
    @Meta.Tau(kind=0, suba=7, subb=20),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.view.ViewGroup", base="ViewGroup")}),
    @Meta.Tau(kind=0, suba=7, subb=22),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="frege.prelude.PreludeBase", base="Maybe")}),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.os.Bundle", base="Bundle")}),
    @Meta.Tau(kind=0, suba=7, subb=25), @Meta.Tau(kind=0, suba=24, subb=26),
    @Meta.Tau(kind=2, suba=0, tcon={@Meta.QName(kind=0, pack="froid.view.View", base="View")}),
    @Meta.Tau(kind=0, suba=7, subb=28), @Meta.Tau(kind=0, suba=15, subb=29), @Meta.Tau(kind=0, suba=15, subb=19),
    @Meta.Tau(kind=0, suba=15, subb=4)
  },
  rhos={
    @Meta.Rho(rhofun=false, rhotau=4), @Meta.Rho(rhofun=false, rhotau=9), @Meta.Rho(rhofun=false, rhotau=11),
    @Meta.Rho(rhofun=false, rhotau=13), @Meta.Rho(rhofun=false, rhotau=17), @Meta.Rho(sigma=3, rhotau=4),
    @Meta.Rho(sigma=2, rhotau=5), @Meta.Rho(sigma=1, rhotau=6), @Meta.Rho(sigma=0, rhotau=7),
    @Meta.Rho(rhofun=false, rhotau=19), @Meta.Rho(rhofun=false, rhotau=21), @Meta.Rho(rhofun=false, rhotau=23),
    @Meta.Rho(rhofun=false, rhotau=27), @Meta.Rho(rhofun=false, rhotau=30), @Meta.Rho(sigma=8, rhotau=13),
    @Meta.Rho(sigma=7, rhotau=14), @Meta.Rho(sigma=6, rhotau=15), @Meta.Rho(sigma=5, rhotau=16),
    @Meta.Rho(sigma=0, rhotau=17), @Meta.Rho(rhofun=false, rhotau=31), @Meta.Rho(sigma=0, rhotau=19),
    @Meta.Rho(rhofun=false, rhotau=3), @Meta.Rho(rhofun=false, rhotau=32), @Meta.Rho(sigma=11, rhotau=22),
    @Meta.Rho(sigma=11, rhotau=23)
  },
  sigmas={
    @Meta.Sigma(rho=0), @Meta.Sigma(rho=1), @Meta.Sigma(rho=2), @Meta.Sigma(rho=3), @Meta.Sigma(rho=8),
    @Meta.Sigma(rho=9), @Meta.Sigma(rho=10), @Meta.Sigma(rho=11), @Meta.Sigma(rho=12), @Meta.Sigma(rho=18),
    @Meta.Sigma(rho=20), @Meta.Sigma(rho=21), @Meta.Sigma(rho=24)
  },
  exprs={@Meta.Expr()}
)
final public class ConsoleFragment  {
  




final public static Func.U<RealWorld, Short> updateView(
  final java.util.concurrent.BlockingQueue<String/*<Character>*/> arg$1, final Lazy<android.widget.EditText> arg$2,
  final Lazy<android.widget.TextView> arg$3, final Lazy<android.widget.ScrollView> arg$4
) {
  final Func.U<RealWorld, String/*<Character>*/> v2038$8208 = Concurrent.TMVar.<String/*<Character>*/>take(
        arg$1
      );
  return new Func.U.D<RealWorld, Short>() {
        public Lazy<Short> apply(final Lazy<RealWorld> arg$8700) {
          final String/*<Character>*/ v2041$8211 = v2038$8208.apply(arg$8700).call();
          final Func.U<RealWorld, Runnable> v2038$8254 = Lang.TRunnable.<RealWorld>$new(
                TextView.TTextView.append(arg$3.call(), v2041$8211 + "\nfrege> ")
              );
          final Func.U<RealWorld, Short> v4801$8233 = EditText.TEditText.setText(arg$2.call(), "");
          final short v4804$8235 = (short)v4801$8233.apply(arg$8700).call();
          final Func.U<RealWorld, Short> v4805$8236 = (new Func.U.D<RealWorld, Short>() {
            public Lazy<Short> apply(final Lazy<RealWorld> arg$8703) {
              final Runnable v2041$8257 = v2038$8254.apply(arg$8703).call();
              final Func.U<RealWorld, Short> v2042$8258 = TextView.TTextView.post(arg$3.call(), v2041$8257);
              return Thunk.<Short>nested(
                        new Lazy.D<Lazy<Short>>() {
                          public Lazy<Short> call() {
                            return v2042$8258.apply(arg$8703);
                          }
                        }
                      );
            }
          }).call();
          return Thunk.<Short>nested(
                    new Lazy.D<Lazy<Short>>() {
                      public Lazy<Short> call() {
                        return v4805$8236.apply(arg$8700);
                      }
                    }
                  );
        }
      };
}
final public static Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>> evaluateInput(
  final Lazy<String/*<Character>*/> arg$1, final Lazy<String/*<Character>*/> arg$2
) {
  final Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>> v2038$8636 =
  Concurrent.TMVar.<String/*<Character>*/>newEmpty().call();
  return new Func.U.D<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>>() {
        public Lazy<java.util.concurrent.BlockingQueue<String/*<Character>*/>> apply(final Lazy<RealWorld> arg$8710) {
          final java.util.concurrent.BlockingQueue<String/*<Character>*/> v2041$8639 =
          v2038$8636.apply(arg$8710).call();
          final Func.U<RealWorld, String/*<Character>*/> v2038$8682 = Net.evaluateExpression(
                arg$2.call(), arg$1
              );
          final Func.U<RealWorld, Short> v4801$8661 = Concurrent.forkIO(
                new Func.U.D<RealWorld, Short>() {
                  public Lazy<Short> apply(final Lazy<RealWorld> arg$8713) {
                    final String/*<Character>*/ v2041$8685 = v2038$8682.apply(arg$8713)
                    .call();
                    final Func.U<RealWorld, Short> v2042$8686 = Concurrent.TMVar.<String/*<Character>*/>put(
                          v2041$8639, v2041$8685
                        );
                    return Thunk.<Short>nested(
                              new Lazy.D<Lazy<Short>>() {
                                public Lazy<Short> call() {
                                  return v2042$8686.apply(arg$8713);
                                }
                              }
                            );
                  }
                }
              );
          final short v4804$8663 = (short)v4801$8661.apply(arg$8710).call();
          final Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>> v4805$8664 =
          Thunk.<Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>>>shared(
                new Lazy.D<Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>>>() {
                  public Func.U<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>> call() {
                    return PreludeMonad.IMonad_ST.<RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>>pure(
                              Thunk.<java.util.concurrent.BlockingQueue<String/*<Character>*/>>lazy(
                                    v2041$8639
                                  )
                            );
                  }
                }
              ).call();
          return Thunk.<java.util.concurrent.BlockingQueue<String/*<Character>*/>>nested(
                    new Lazy.D<Lazy<java.util.concurrent.BlockingQueue<String/*<Character>*/>>>() {
                      public Lazy<java.util.concurrent.BlockingQueue<String/*<Character>*/>> call() {
                        return v4805$8664.apply(arg$8710);
                      }
                    }
                  );
        }
      };
}
final public static Func.U<RealWorld, android.view.View> onCreateView(
  final Lazy<java.util.concurrent.BlockingQueue<String/*<Character>*/>> arg$1,
  final Lazy<android.support.v4.app.Fragment> arg$2, final android.view.LayoutInflater arg$3,
  final android.view.ViewGroup arg$4, final Lazy<PreludeBase.TMaybe<android.os.Bundle>> arg$5
) {
  final Func.U<RealWorld, android.view.View> v2038$8276 = LayoutInflater.TLayoutInflater.inflate(
        arg$3, io.github.mchav.tryfrege.R.layout.fragment_console, arg$4, false
      );
  return new Func.U.D<RealWorld, android.view.View>() {
        public Lazy<android.view.View> apply(final Lazy<RealWorld> arg$8720) {
          final android.view.View v2041$8279 = v2038$8276.apply(arg$8720).call();
          final Func.U<RealWorld, android.widget.TextView> v2038$8298 = TextView.asTextView(
                new Func.U.D<Integer, Func.U<RealWorld, android.view.View>>() {
                  public Lazy<Func.U<RealWorld, android.view.View>> apply(final Lazy<Integer> η$8722) {
                    return Thunk.<Func.U<RealWorld, android.view.View>>shared(
                              new Lazy.D<Func.U<RealWorld, android.view.View>>() {
                                public Func.U<RealWorld, android.view.View> call() {
                                  return View.TView.findViewById(v2041$8279, (int)η$8722.call());
                                }
                              }
                            );
                  }
                },
                Thunk.<Integer>lazy(io.github.mchav.tryfrege.R.id.console)
              );
          final android.widget.TextView v2041$8301 = v2038$8298.apply(arg$8720).call();
          final Func.U<RealWorld, android.widget.ScrollView> v2038$8320 = ScrollView.asScrollView(
                new Func.U.D<Integer, Func.U<RealWorld, android.view.View>>() {
                  public Lazy<Func.U<RealWorld, android.view.View>> apply(final Lazy<Integer> η$8725) {
                    return Thunk.<Func.U<RealWorld, android.view.View>>shared(
                              new Lazy.D<Func.U<RealWorld, android.view.View>>() {
                                public Func.U<RealWorld, android.view.View> call() {
                                  return View.TView.findViewById(v2041$8279, (int)η$8725.call());
                                }
                              }
                            );
                  }
                },
                Thunk.<Integer>lazy(io.github.mchav.tryfrege.R.id.scroller)
              );
          final android.widget.ScrollView v2041$8323 = v2038$8320.apply(arg$8720).call();
          final Func.U<RealWorld, Runnable> v2038$8342 = Lang.TRunnable.<RealWorld>$new(
                ScrollView.TScrollView.fullScroll(v2041$8323, android.view.View.FOCUS_DOWN)
              );
          final Runnable v2041$8345 = v2038$8342.apply(arg$8720).call();
          final Func.U<RealWorld, android.widget.EditText> v2038$8388 = EditText.asEditText(
                new Func.U.D<Integer, Func.U<RealWorld, android.view.View>>() {
                  public Lazy<Func.U<RealWorld, android.view.View>> apply(final Lazy<Integer> η$8730) {
                    return Thunk.<Func.U<RealWorld, android.view.View>>shared(
                              new Lazy.D<Func.U<RealWorld, android.view.View>>() {
                                public Func.U<RealWorld, android.view.View> call() {
                                  return View.TView.findViewById(v2041$8279, (int)η$8730.call());
                                }
                              }
                            );
                  }
                },
                Thunk.<Integer>lazy(io.github.mchav.tryfrege.R.id.console_input)
              );
          final Func.U<RealWorld, Short> v4801$8367 = ScrollView.TScrollView.post(v2041$8323, v2041$8345);
          final short v4804$8369 = (short)v4801$8367.apply(arg$8720).call();
          final Func.U<RealWorld, android.view.View> v4805$8370 = (new Func.U.D<RealWorld, android.view.View>() {
            public Lazy<android.view.View> apply(final Lazy<RealWorld> arg$8732) {
              final android.widget.EditText v2041$8391 = v2038$8388.apply(arg$8732).call();
              final Func.U<RealWorld, android.view.View> v2038$8410 = View.TView.findViewById(
                    v2041$8279, io.github.mchav.tryfrege.R.id.eval
                  );
              final android.view.View v2041$8413 = v2038$8410.apply(arg$8732).call();
              final Func.U<RealWorld, android.content.Context> v2038$8546 = Fragment.TFragment.getContext(
                    arg$2.call()
                  );
              final Func.U<RealWorld, Short> v4801$8435 = View.setViewOnClick(
                    v2041$8413,
                    new Func.U.D<android.view.View, Func.U<RealWorld, Short>>() {
                      public Lazy<Func.U<RealWorld, Short>> apply(final Lazy<android.view.View> arg$8746) {
                        final Func.U<RealWorld, String/*<Character>*/> v2038$8456 = Func.<
                          RealWorld, String/*<Character>*/
                        >coerceU(
                              PreludeMonad.<Func.U<RealWorld, ?>, CharSequence, String/*<Character>*/>liftM(
                                    PreludeMonad.IMonad_ST.<RealWorld>mk(),
                                    new Func.U.D<CharSequence, String/*<Character>*/>() {
                                      public Lazy<String/*<Character>*/> apply(final Lazy<CharSequence> η$8747) {
                                        return Thunk.<String/*<Character>*/>shared(
                                                  new Lazy.D<String/*<Character>*/>() {
                                                    public String/*<Character>*/ call() {
                                                      return η$8747.call().toString();
                                                    }
                                                  }
                                                );
                                      }
                                    },
                                    Thunk.<Kind.U<Func.U<RealWorld, ?>, CharSequence>>shared(
                                          new Lazy.D<Kind.U<Func.U<RealWorld, ?>, CharSequence>>() {
                                            public Kind.U<Func.U<RealWorld, ?>, CharSequence> call() {
                                              return (Kind.U<Func.U<RealWorld, ?>, CharSequence>)Thunk.<
                                                    Func.U<RealWorld, CharSequence>
                                                  >shared(
                                                        new Lazy.D<Func.U<RealWorld, CharSequence>>() {
                                                          public Func.U<RealWorld, CharSequence> call() {
                                                            return EditText.TEditText.getText(
                                                                      v2041$8391
                                                                    );
                                                          }
                                                        }
                                                      ).call();
                                            }
                                          }
                                        )
                                  )
                            );
                        return new Func.U.D<RealWorld, Short>() {
                              public Lazy<Short> apply(final Lazy<RealWorld> arg$8749) {
                                final String/*<Character>*/ v2041$8459 = v2038$8456.apply(
                                      arg$8749
                                    ).call();
                                final Func.U<RealWorld, String/*<Character>*/> v2038$8502 =
                                Utilities.<String/*<Character>*/>readMVar(arg$1.call());
                                final Func.U<RealWorld, Short> v4801$8481 = TextView.TTextView.append(
                                      v2041$8301, v2041$8459 + "\n"
                                    );
                                final short v4804$8483 = (short)v4801$8481.apply(arg$8749)
                                .call();
                                final Func.U<RealWorld, Short> v4805$8484 = (new Func.U.D<
                                  RealWorld, Short
                                >() {
                                  public Lazy<Short> apply(final Lazy<RealWorld> arg$8752) {
                                    final String/*<Character>*/ v2041$8505 = v2038$8502
                                    .apply(arg$8752).call();
                                    final Func.U<
                                      RealWorld, java.util.concurrent.BlockingQueue<String/*<Character>*/>
                                    > v2038$8524 = ConsoleFragment.evaluateInput(
                                          Thunk.<String/*<Character>*/>lazy(v2041$8505),
                                          Thunk.<String/*<Character>*/>lazy(v2041$8459)
                                        );
                                    final java.util.concurrent.BlockingQueue<String/*<Character>*/> v2041$8527 =
                                    v2038$8524.apply(arg$8752).call();
                                    final Func.U<RealWorld, Short> v2042$8528 = ConsoleFragment.updateView(
                                          v2041$8527, Thunk.<android.widget.EditText>lazy(v2041$8391),
                                          Thunk.<android.widget.TextView>lazy(v2041$8301),
                                          Thunk.<android.widget.ScrollView>lazy(v2041$8323)
                                        );
                                    return Thunk.<Short>nested(
                                              new Lazy.D<Lazy<Short>>() {
                                                public Lazy<Short> call() {
                                                  return v2042$8528.apply(arg$8752);
                                                }
                                              }
                                            );
                                  }
                                }).call();
                                return Thunk.<Short>nested(
                                          new Lazy.D<Lazy<Short>>() {
                                            public Lazy<Short> call() {
                                              return v4805$8484.apply(arg$8749);
                                            }
                                          }
                                        );
                              }
                            };
                      }
                    }
                  );
              final short v4804$8437 = (short)v4801$8435.apply(arg$8732).call();
              final Func.U<RealWorld, android.view.View> v4805$8438 = (new Func.U.D<RealWorld, android.view.View>() {
                public Lazy<android.view.View> apply(final Lazy<RealWorld> arg$8737) {
                  final android.content.Context v2041$8549 = v2038$8546.apply(arg$8737)
                  .call();
                  final Func.U<RealWorld, android.content.res.AssetManager> v2038$8568 =
                  Context.TContext.getAssets(v2041$8549);
                  final android.content.res.AssetManager v2041$8571 = v2038$8568.apply(
                        arg$8737
                      ).call();
                  final Func.U<RealWorld, android.graphics.Typeface> v2038$8590 = Typeface.TTypeface.createFromAsset(
                        v2041$8571, "fonts/TerminusTTF.ttf"
                      );
                  final android.graphics.Typeface v2041$8593 = v2038$8590.apply(arg$8737)
                  .call();
                  final Func.U<RealWorld, Short> v4801$8615 = TextView.TTextView.setTypeface(
                        v2041$8301, v2041$8593
                      );
                  final short v4804$8617 = (short)v4801$8615.apply(arg$8737).call();
                  final Func.U<RealWorld, android.view.View> v4805$8618 = Thunk.<Func.U<RealWorld, android.view.View>>shared(
                        new Lazy.D<Func.U<RealWorld, android.view.View>>() {
                          public Func.U<RealWorld, android.view.View> call() {
                            return PreludeMonad.IMonad_ST.<RealWorld, android.view.View>pure(
                                      Thunk.<android.view.View>lazy(v2041$8279)
                                    );
                          }
                        }
                      ).call();
                  return Thunk.<android.view.View>nested(
                            new Lazy.D<Lazy<android.view.View>>() {
                              public Lazy<android.view.View> call() {
                                return v4805$8618.apply(arg$8737);
                              }
                            }
                          );
                }
              }).call();
              return Thunk.<android.view.View>nested(
                        new Lazy.D<Lazy<android.view.View>>() {
                          public Lazy<android.view.View> call() {
                            return v4805$8438.apply(arg$8732);
                          }
                        }
                      );
            }
          }).call();
          return Thunk.<android.view.View>nested(
                    new Lazy.D<Lazy<android.view.View>>() {
                      public Lazy<android.view.View> call() {
                        return v4805$8370.apply(arg$8720);
                      }
                    }
                  );
        }
      };
}
final public static Func.U<RealWorld, android.support.v4.app.Fragment> newConsoleFragment(
  final Lazy<java.util.concurrent.BlockingQueue<String/*<Character>*/>> arg$1
) {
  return Fragment.mkFragment(
            Fragment.TFragmentDelegator.upd$onCreateView(
                  Fragment.defaultFragmentDelegator,
                  PreludeBase.TMaybe.DJust.<
                    Func.U<
                      android.support.v4.app.Fragment,
                      Func.U<
                        android.view.LayoutInflater,
                        Func.U<
                          android.view.ViewGroup,
                          Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                        >
                      >
                    >
                  >mk(
                        new Func.U.D<
                          android.support.v4.app.Fragment,
                          Func.U<
                            android.view.LayoutInflater,
                            Func.U<
                              android.view.ViewGroup,
                              Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                            >
                          >
                        >() {
                          public Lazy<Func.U<
                            android.view.LayoutInflater,
                            Func.U<
                              android.view.ViewGroup,
                              Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                            >
                          >> apply(final Lazy<android.support.v4.app.Fragment> η$8766) {
                            return new Func.U.D<
                                  android.view.LayoutInflater,
                                  Func.U<
                                    android.view.ViewGroup,
                                    Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                                  >
                                >() {
                                  public Lazy<Func.U<
                                    android.view.ViewGroup,
                                    Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                                  >> apply(final Lazy<android.view.LayoutInflater> η$8767) {
                                    return new Func.U.D<
                                          android.view.ViewGroup,
                                          Func.U<PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>>
                                        >() {
                                          public Lazy<Func.U<
                                            PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>
                                          >> apply(final Lazy<android.view.ViewGroup> η$8768) {
                                            return new Func.U.D<
                                                  PreludeBase.TMaybe<android.os.Bundle>, Func.U<RealWorld, android.view.View>
                                                >() {
                                                  public Lazy<Func.U<RealWorld, android.view.View>> apply(
                                                    final Lazy<PreludeBase.TMaybe<android.os.Bundle>> η$8769
                                                  ) {
                                                    return Thunk.<Func.U<RealWorld, android.view.View>>shared(
                                                              new Lazy.D<Func.U<RealWorld, android.view.View>>() {
                                                                public Func.U<RealWorld, android.view.View> call() {
                                                                  return ConsoleFragment.onCreateView(
                                                                            arg$1, η$8766, η$8767.call(),
                                                                            η$8768.call(), η$8769
                                                                          );
                                                                }
                                                              }
                                                            );
                                                  }
                                                };
                                          }
                                        };
                                  }
                                };
                          }
                        }
                      )
                )
          );
}

}
