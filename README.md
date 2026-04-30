# sigelab_master
繁枡研の院課題用のリポジトリです．

コマンドを打たないで良いsetting.jsonです　
1.VScode左下の設定マーククリック
2.上から３番目のsettingを選択
3.右上のファイルに矢印のタブを選択(カーソルを合わせたらopen settings(json)と見れる)
4.佐藤を信じて以下のコードをコピペ、設定いじってる人はAIに統合してもらうか自身で書き換えて。それ以外は元のコードは不要全削除
5.ctr+sでlatexのコンパイルから不要ファイルの削除まで可能に

settings.json
----の下から----までコピペ

-------------------------------------------
{
    "terminal.integrated.profiles.windows": {
        "PowerShell": {
            "source": "PowerShell",
            "icon": "terminal-powershell"
        },
        "Command Prompt": {
            "path": [
                "${env:windir}\\Sysnative\\cmd.exe",
                "${env:windir}\\System32\\cmd.exe"
            ],
            "args": [],
            "icon": "terminal-cmd"
        },
        "Git Bash": {
            "path": "C:\\Program Files\\Git\\bin\\bash.exe",
            "args": [
                "--login",
                "-i"
            ]
        }
    },
    "terminal.integrated.defaultProfile.windows": "Git Bash",
    "files.autoSave": "afterDelay",

    "latex-workshop.latex.recipes": [
    {
      "name": "latexmk (upLaTeX)",
      "tools": [
        "latexmk"
      ]
    }
  ],
  "latex-workshop.latex.tools": [
    {
      "name": "latexmk",
      "command": "latexmk",
      "args": [
        "-e",
        "$latex=q/uplatex %O -interaction=nonstopmode -synctex=1 -halt-on-error %S/",
        "-e",
        "$bibtex=q/upbibtex %O %B/",
        "-e",
        "$biber=q/biber %O --bblencoding=utf8 -u -U --output_safechars %B/",
        "-e",
        "$makeindex=q/upmendex %O -o %D %S/",
        "-e",
        "$dvipdf=q/dvipdfmx %O -o %D %S/",
        "-gg",
        "-pdfdvi",
        "%DOC%"
      ]
    }
  ],
  "latex-workshop.latex.autoBuild.run": "onFileChange",
  "latex-workshop.view.pdf.viewer": "tab",
  "git.enableSmartCommit": true,
  "latex-workshop.latex.autoClean.run": "onBuilt",
  "latex-workshop.latex.clean.fileTypes": [
    "*.aux",
    "*.bbl",
    "*.bcf",
    "*.blg",
    "*.fdb_latexmk",
    "*.fls",
    "*.log",
    "*.lof",
    "*.lot",
    "*.out",
    "*.run.xml",
    "*.synctex.gz",
    "*.toc",
    "*.dvi"
  ]
}
---------------------------------------